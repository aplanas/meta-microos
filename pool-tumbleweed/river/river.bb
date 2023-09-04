SUMMARY = "A dynamic tiling Wayland compositor"
DESCRIPTION = "River is a dynamic tiling Wayland compositor with flexible runtime configuration."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-0.2.4+g953-2.1.aarch64.rpm"
RPM_HASH = "56c51974029ab3685feada06b338ba3215ac76241bd82fd236ed8e68901022e7b4138f2db057d1ef3ae6389c4a8580b48e33a0c49cba43c243bc1b037ad4e9de"

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
