SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.29.1"

RPM_NAME = "kitty-0.29.1-1.1.aarch64.rpm"
RPM_HASH = "5f777b79f11275a86af24d9349a106d31d6532f8a39d6513f6d821ac08f70227c4e9f0204d165cc191b8b3b53ab35b94cec4281a9bb0b4c9139c284d0b9fed14"

RPROVIDES:${PN} += "kitty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libharfbuzz.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libpython3.11.so.1.0 \
librsync.so.2 \
libwayland-client.so.0 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
