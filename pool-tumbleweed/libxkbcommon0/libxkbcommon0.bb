SUMMARY = "Library for handling xkb descriptions"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. Unfortunately, X11's \
requirements mean this is not actually usable for the X server, but it \
should be perfectly usable for client toolkits, as well as alternative \
windowing systems, compositors and system-level clients such as \
Wayland and kmscon."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon0-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "a91a4642e7f0b511fc1bf6b335cf85b13f047f9fcd89dc047bc30404337b903cc89a0a02ca78ba6d4728cdd51c827a684c86589a68b207083663a0c17e0ccdf6"

RPROVIDES:${PN} += "libxkbcommon.so.0 \
libxkbcommon0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
xkeyboard-config"

inherit rpm
