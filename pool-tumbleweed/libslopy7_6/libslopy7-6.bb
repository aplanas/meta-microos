SUMMARY = "Screen region selection library"
DESCRIPTION = "This library implements the slop utility's functionality to mark a \
region ont the screen."
LICENSE = "GPL-3.0-or-later"

PV = "7.6"

RPM_NAME = "libslopy7_6-7.6-2.6.aarch64.rpm"
RPM_HASH = "aedf076351745b628be7baf7232017dcd3fd9c277d146e91c6493f2fdcd555204d44e6b3728d98669444658ee29ba0a0883c018072cad093afb90ea62156cc14"

RPROVIDES:${PN} += "libslopy.so.7.6 \
libslopy7-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
