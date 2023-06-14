SUMMARY = "XFree86-VidMode X extension library"
DESCRIPTION = "These functions provide aninterface to the server extension \
XFree86-VidModeExtension which allows the video modes to be queried \
and adjusted dynamically and mode switching to be controlled."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libXxf86vm1-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "7548f46825b5430cc2e1f43e51c1d7f6a891c5890ac2789cd47ebb5a80d1b87b15f3b5829541729e96f7a80371a75499b2ddbb20e02579571199fef405d7e40f"

RPROVIDES:${PN} += "libXxf86vm.so.1 \
libXxf86vm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
