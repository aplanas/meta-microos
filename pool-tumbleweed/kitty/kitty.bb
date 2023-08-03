SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.29.2"

RPM_NAME = "kitty-0.29.2-1.1.aarch64.rpm"
RPM_HASH = "77c66f5fbbcbc2b813b7105db3b1b8dec3279916bc336cb04f36d716cc17a67a0dc9f9883656b5399f481ac91866cb357c0dff4d6f96d93cc72914b9918b4552"

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
