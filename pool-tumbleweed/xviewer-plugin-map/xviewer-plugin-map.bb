SUMMARY = "Xviewer map plugin"
DESCRIPTION = "xviewer map plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-map-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "a929a146cc43b3d4aa93c8408010ffa54a6ed23e5d50c6cd9f8c666aa44339b1e62fd8bc3bb942f6c3ca4bbd98159e0421ec656c7e32bd52abdf1c92fe568ef4"

RPROVIDES:${PN} += "libmap.so \
xviewer-plugin-map \
xviewer-plugins-/usr/lib64/xviewer/plugins/map.plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libexif.so.12 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
xviewer-plugins-data"

inherit rpm
