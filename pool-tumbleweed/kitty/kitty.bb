SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.29.0"

RPM_NAME = "kitty-0.29.0-1.1.aarch64.rpm"
RPM_HASH = "50cd540575ff1d16b5eb8e652a1d6c8d6f2dc8212c6cec76ccb453a42f4aabde5db96ef836f0cbb991715e079f99b3a452e0c219a7bc573f72a1d8b2200165ff"

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
