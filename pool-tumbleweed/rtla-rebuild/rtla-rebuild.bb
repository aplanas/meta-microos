SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "rtla-rebuild-6.4.2-5.7.aarch64.rpm"
RPM_HASH = "4c2094c05954b7461a4acc5aa8a151881164194b9eccdd3a4bfbbe376163f669fd2c4b0f01a37ccf221ec770c922c04222c6ad8a0bd25f631e79d8189b41504a"

RPROVIDES:${PN} += "rtla-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
