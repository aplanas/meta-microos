SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "This is a fork of rofi with added support for Wayland via the layer shell protocol."
LICENSE = "MIT"

PV = "1.7.5+wayland2+git.1690115482.ff2338c"

RPM_NAME = "rofi-wayland-1.7.5+wayland2+git.1690115482.ff2338c-1.1.aarch64.rpm"
RPM_HASH = "da65f7a8064b330ac5272781127b4634251b9b6cf1867e7716cf198205bc5ff38086cdca598c1d524772112d4de1c70dbb3223c46b6f3e45d8ede2bbfb7a314b"

RPROVIDES:${PN} += "rofi-launcher \
rofi-wayland"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
