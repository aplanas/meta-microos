SUMMARY = "Eog light-theme plugin"
DESCRIPTION = "The Eye of Gnome Light Theme plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-light-theme-44.0-1.1.aarch64.rpm"
RPM_HASH = "5a2149b5742355d62c03f8b32b29c457d0147c9f5c5451003e22391e16606a96b2fcdff30bb4d23463e78fa6efe9723b03a27114f582d5af0b6fa37a49507d5f"

RPROVIDES:${PN} += "eog-plugin-light-theme \
eog-plugin-light-theme(aarch-64) \
eog-plugins:/usr/lib64/eog/plugins/light-theme.plugin \
liblight-theme.so()(64bit) \
metainfo() \
metainfo(eog-light-theme.appdata.xml)"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libeog.so()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit)"

inherit rpm
