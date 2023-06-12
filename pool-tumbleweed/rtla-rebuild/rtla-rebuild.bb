SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "rtla-rebuild-6.3.4-5.3.aarch64.rpm"
RPM_HASH = "0d4808c8ffa12e977397adaf9e5bd29bf91c1b0ab86874b982cadbdecac88c473d9f4ac46ffc9ef42f533a4e20d46f7a53c8d92dcd9f22c6e3650591b815d5d2"

RPROVIDES:${PN} += "rtla-rebuild \
rtla-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm
