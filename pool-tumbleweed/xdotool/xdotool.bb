SUMMARY = "Fake keyboard/mouse input"
DESCRIPTION = "This tool lets you programatically (or manually) simulate keyboard input and \
mouse activity, move and resize windows, etc. It does this using X11's XTEST \
extension and other Xlib functions."
LICENSE = "BSD-3-Clause"

PV = "3.20211022.1"

RPM_NAME = "xdotool-3.20211022.1-1.6.aarch64.rpm"
RPM_HASH = "b3adda1ee888a7f42f6969b5e396771fb4ab67688e2d4d8f4253785a15050430bb82673f418431e670ef426a42de3a6314c94c2b9b168ae12380fd53b0bec9dc"

RPROVIDES:${PN} += "libxdo.so.3()(64bit) \
xdotool \
xdotool(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
