SUMMARY = "Eog map plugin"
DESCRIPTION = "The Eye of Gnome map plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-map-44.0-1.1.aarch64.rpm"
RPM_HASH = "f389990d4234d522a653055ec632edba19015e8d6c50dd6279d0daa2e9e0346d6b2331452d6c88b327937bfec6607fdd61fd53f3b9a603f98a9968a13c9be1e0"

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
