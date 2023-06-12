SUMMARY = "Development files for the libxkbcommon library"
DESCRIPTION = "xkbcommon is a keymap handling library, which can parse XKB \
descriptions (e.g. from xkeyboard-config), and use this to help its \
users make sense of their keyboard input. Unfortunately, X11's \
requirements mean this is not actually usable for the X server, but it \
should be perfectly usable for client toolkits, as well as alternative \
windowing systems, compositors and system-level clients such as \
Wayland and kmscon. \
 \
This package contains the development headers for the library found \
in libxkbcommon."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-devel-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "57aa11b0d3fea94eacf5bb18a4a4c12fe8b840b03a1bf4639c223f5e36d3970dbe667c183af50bfb21a920198d8611fe16eb9aeca52f7bb515ff800578a845c9"

RPROVIDES:${PN} += "libxkbcommon-devel \
libxkbcommon-devel(aarch-64) \
pkgconfig(xkbcommon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbcommon0"

inherit rpm
