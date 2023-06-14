SUMMARY = "Xviewer map plugin"
DESCRIPTION = "xviewer map plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-map-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "2fcda3692a409beb1e148e790b0538bf6648b2186a0ae130c76396cde24c362226ef96df090f407c67bd78f455a02d348c3fe4fe4735685fb2cdb88384f61517"

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
