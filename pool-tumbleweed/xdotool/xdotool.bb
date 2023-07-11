SUMMARY = "Fake keyboard/mouse input"
DESCRIPTION = "This tool lets you programatically (or manually) simulate keyboard input and \
mouse activity, move and resize windows, etc. It does this using X11's XTEST \
extension and other Xlib functions."
LICENSE = "BSD-3-Clause"

PV = "3.20211022.1"

RPM_NAME = "xdotool-3.20211022.1-1.7.aarch64.rpm"
RPM_HASH = "3c04ced2ea74e58a0e1ae2a9ebf689637df203e3b49e93f82fd3c5c5a25adb141f8ed59b0e31c1333fbd0d86c16e47867c3ea86a8e9e6c5ec809e6681b870418"

RPROVIDES:${PN} += "libxdo.so.3 \
xdotool"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libXtst.so.6 \
libc.so.6 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
