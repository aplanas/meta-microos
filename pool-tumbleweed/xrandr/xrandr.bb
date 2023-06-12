SUMMARY = "Primitive command line interface to RandR extension"
DESCRIPTION = "Xrandr is used to set the size, orientation and/or reflection of \
the outputs for a screen. It can also set the screen size."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "xrandr-1.5.2-1.3.aarch64.rpm"
RPM_HASH = "82e20b84ced84651f39b30fb3f3098372b0497c91d0b2d785ce92b002772b021c3d13c92f83d208431399e5451a8f3d7d7dceb7f9ce7627b27a984e5772a15df"

RPROVIDES:${PN} += "xrandr \
xrandr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
