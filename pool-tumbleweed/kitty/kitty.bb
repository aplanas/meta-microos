SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.28.1"

RPM_NAME = "kitty-0.28.1-1.4.aarch64.rpm"
RPM_HASH = "ec821ef2e5c46f21e296d9cc437af187bb1911ec1ab4bc24dba8097149457e3f818cf8e6cf20d6a9c4aa8a46d9cd5889a4628da82f17e2870e61a890de82283f"

RPROVIDES:${PN} += "kitty"

RDEPENDS:${PN} += "/usr/bin/sh \
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
libpython3.11.so.1.0 \
librsync.so.2 \
libwayland-client.so.0 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
