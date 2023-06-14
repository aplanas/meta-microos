SUMMARY = "Video mode tuner for the X server"
DESCRIPTION = "xvidtune is a client interface to the X server video mode \
extension (XFree86-VidModeExtension)."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "xvidtune-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "01a46b80bd6f0db7c4635b2ff8d44b1674ca97e30b9a4e9dfb35df22109c8bf17cb77e4b4c393cc962b2a1a52f83e4ed44a3ebc2e797395bb8c4c1df102501e8"

RPROVIDES:${PN} += "xvidtune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libXxf86vm.so.1 \
libc.so.6"

inherit rpm
