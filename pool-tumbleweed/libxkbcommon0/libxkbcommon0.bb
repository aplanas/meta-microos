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

RPM_NAME = "libxkbcommon0-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "073419c29d21b3e1ddde85cbc973c89fe84f3c1d2c9ddf3ee8b14c4f6ea9846b60dba6e29890dfabd326499b6a7697756db15608b9c497f73a03f3c37c26dede"

RPROVIDES:${PN} += "libxkbcommon.so.0 \
libxkbcommon0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
xkeyboard-config"

inherit rpm
