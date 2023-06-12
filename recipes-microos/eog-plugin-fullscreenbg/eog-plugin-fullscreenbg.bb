SUMMARY = "Eog fullscreenbg plugin"
DESCRIPTION = "The Eye of Gnome Fullscreen Background plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-fullscreenbg-44.0-1.1.aarch64.rpm"
RPM_HASH = "e5ba3b6be4dc5f3d0960245e94bced8de79b7d0459a84ac723928a84f2cc827f2ef9f5a7f765b4e3ec70e78671325fed4bdfe33c190778e1f2ff0e875fb6ff49"

RPROVIDES:${PN} += "eog-plugin-fullscreenbg \
eog-plugin-fullscreenbg(aarch-64) \
eog-plugins:/usr/lib64/eog/plugins/fullscreenbg.plugin \
metainfo() \
metainfo(eog-fullscreenbg.appdata.xml)"
RDEPENDS:${PN} += "eog-plugins-data \
typelib(Eog) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(PeasGtk)"

inherit rpm
