SUMMARY = "Fake keyboard/mouse input"
DESCRIPTION = "This tool lets you programatically (or manually) simulate keyboard input and \
mouse activity, move and resize windows, etc. It does this using X11's XTEST \
extension and other Xlib functions."
LICENSE = "BSD-3-Clause"

PV = "3.20211022.1"

RPM_NAME = "xdotool-3.20211022.1-1.6.aarch64.rpm"
RPM_HASH = "b3adda1ee888a7f42f6969b5e396771fb4ab67688e2d4d8f4253785a15050430bb82673f418431e670ef426a42de3a6314c94c2b9b168ae12380fd53b0bec9dc"

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
