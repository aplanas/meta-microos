SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.28.1"

RPM_NAME = "kitty-0.28.1-1.2.aarch64.rpm"
RPM_HASH = "6af78bc00922aed99aceddcf13d81622d1d945ffc648c95e09946fea8345d56540e384208988fd15f8340b26fda321dac344d026a5187ab5dace95908d91200d"

RPROVIDES:${PN} += "application() \
application(kitty-open.desktop) \
application(kitty.desktop) \
kitty \
kitty(aarch-64) \
mimehandler(application/x-sh) \
mimehandler(application/x-shellscript) \
mimehandler(image/*) \
mimehandler(inode/directory) \
mimehandler(text/*) \
mimehandler(x-scheme-handler/kitty) \
mimehandler(x-scheme-handler/ssh)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libharfbuzz.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpython3.10.so.1.0()(64bit) \
librsync.so.2()(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_1.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
