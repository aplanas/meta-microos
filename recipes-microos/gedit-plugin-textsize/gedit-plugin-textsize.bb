SUMMARY = "Gedit textsize plugin"
DESCRIPTION = "The gedit textsize plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-textsize-44.1-1.3.aarch64.rpm"
RPM_HASH = "7c1afc089a5eebca934c2d6f4b6a0362b19fa130e53d5efe071ce96a601bc1187bb58a72ab515ae5cb4486b75d2eb9f247097c86da1956e826f775a208864b60"

RPROVIDES:${PN} += "gedit-plugin-textsize \
gedit-plugin-textsize(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/textsize.plugin \
metainfo() \
metainfo(gedit-textsize.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data \
typelib(GObject) \
typelib(Gdk) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango)"

inherit rpm
