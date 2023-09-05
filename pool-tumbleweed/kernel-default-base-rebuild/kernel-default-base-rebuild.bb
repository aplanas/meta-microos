SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-default-base-rebuild-6.4.12-1.1.28.10.aarch64.rpm"
RPM_HASH = "6643467c3c93eb64eabe718cd68b8de96098692027e6078541960dcb9c0d3295173fca271af276c9eba83f24306bf3f9dde8de1ad485bc9cc8fcff740869de9e"

RPROVIDES:${PN} += "kernel-default-base-rebuild"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
