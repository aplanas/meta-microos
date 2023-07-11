SUMMARY = "Lightweight notification daemon for Wayland"
DESCRIPTION = "Lightweight notification daemon for Wayland."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "fnott-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "ed3915d59936b0b106c620a3ab8829390d4e008c3b0f87ef79b2c89c68259d172c80affdd31bce46a2e43ae4dacd7fd516b824bf58f791daea0626a1efd8c2a1"

RPROVIDES:${PN} += "fnott"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
