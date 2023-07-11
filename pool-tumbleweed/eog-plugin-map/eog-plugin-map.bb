SUMMARY = "Eog map plugin"
DESCRIPTION = "The Eye of Gnome map plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-map-44.0-1.2.aarch64.rpm"
RPM_HASH = "4b27d54906b2cc06d7441903d76d2ef41d9f6f1f64efe88c782cf70830530c72915ee8213acd381312334ef074051a70da9775c634a09d4f002dfc02fccf5e57"

RPROVIDES:${PN} += "eog-plugin-map \
eog-plugins-/usr/lib64/eog/plugins/map.plugin \
libmap.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libeog.so \
libexif.so.12 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
