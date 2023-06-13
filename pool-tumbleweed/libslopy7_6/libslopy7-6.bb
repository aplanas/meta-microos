SUMMARY = "Screen region selection library"
DESCRIPTION = "This library implements the slop utility's functionality to mark a \
region ont the screen."
LICENSE = "GPL-3.0-or-later"

PV = "7.6"

RPM_NAME = "libslopy7_6-7.6-2.6.aarch64.rpm"
RPM_HASH = "aedf076351745b628be7baf7232017dcd3fd9c277d146e91c6493f2fdcd555204d44e6b3728d98669444658ee29ba0a0883c018072cad093afb90ea62156cc14"

RPROVIDES:${PN} += "libslopy.so.7.6()(64bit) \
libslopy7_6 \
libslopy7_6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
