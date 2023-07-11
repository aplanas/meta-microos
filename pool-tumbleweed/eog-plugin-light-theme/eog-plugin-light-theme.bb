SUMMARY = "Eog light-theme plugin"
DESCRIPTION = "The Eye of Gnome Light Theme plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-light-theme-44.0-1.2.aarch64.rpm"
RPM_HASH = "d5fec2e1d1808a1a5dbc101cfcd602bcf8f6178504f4af92d85f72db136c72334b67428b8daceed77b913ef745108f694b83a5bf94796e4ad7c625664b6118a6"

RPROVIDES:${PN} += "eog-plugin-light-theme \
eog-plugins-/usr/lib64/eog/plugins/light-theme.plugin \
liblight-theme.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeog.so \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
