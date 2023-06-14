SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.28.1"

RPM_NAME = "kitty-0.28.1-1.2.aarch64.rpm"
RPM_HASH = "6af78bc00922aed99aceddcf13d81622d1d945ffc648c95e09946fea8345d56540e384208988fd15f8340b26fda321dac344d026a5187ab5dace95908d91200d"

RPROVIDES:${PN} += "kitty"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libharfbuzz.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libpython3.10.so.1.0 \
librsync.so.2 \
libwayland-client.so.0 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
