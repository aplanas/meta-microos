SUMMARY = "A dynamic tiling Wayland compositor"
DESCRIPTION = "River is a dynamic tiling Wayland compositor with flexible runtime configuration."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-0.2.4+g953-1.1.aarch64.rpm"
RPM_HASH = "8ebd3a662c79b306eb8baded837ac149ba00c5c0b1da40ee998d01b9faeb4eee68c9ea528ab307bb3a0cf61136d9b2365594125b0dceef09fa216ea5a6715afb"

RPROVIDES:${PN} += "river"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libinput.so.10 \
libpixman-1.so.0 \
libwayland-server.so.0 \
libwlroots.so.11 \
libxkbcommon.so.0 \
river-riverctl \
river-rivertile"

inherit rpm
