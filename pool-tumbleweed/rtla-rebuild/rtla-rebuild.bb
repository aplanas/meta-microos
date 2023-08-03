SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "rtla-rebuild-6.4.6-5.10.aarch64.rpm"
RPM_HASH = "39d83d255dbb69ef60808dfada7af3ad05691f7a3be172deb83a9f5bf3adb960c0ca55692c04054d1cf977b32f0d1d14fb864c9b86fbb7c5bde3166c666c4a28"

RPROVIDES:${PN} += "rtla-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
