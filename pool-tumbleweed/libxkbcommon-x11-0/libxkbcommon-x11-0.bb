SUMMARY = "Library for handling xkb descriptions using XKB-X11"
DESCRIPTION = "An addon library that supports creating keymaps with the XKB X11 \
protocol by querying the X server directly."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-x11-0-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "899805c9a8b5a60dd43330a4d0336feea6618bc52b6f984c727cafb812f75e653841b452dcfa023ffe931b8765f0cbaac205d85a8fb21df96a21ea8095fdceb2"

RPROVIDES:${PN} += "libxkbcommon-x11-0 \
libxkbcommon-x11.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
