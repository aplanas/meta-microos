SUMMARY = "Gedit synctex plugin"
DESCRIPTION = "The gedit synctex plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-synctex-44.1-1.3.aarch64.rpm"
RPM_HASH = "802bcfa3e45ff75b2de04a5abd4298040b0964ba02d780bf7b4b2bcfcbae1bd82eb692d99d5ba0a5007eb20d84fb98a8cb4fc9d836fe31c6c55c471ac389b2ef"

RPROVIDES:${PN} += "gedit-plugin-synctex \
gedit-plugin-synctex(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/synctex.plugin \
metainfo() \
metainfo(gedit-synctex.metainfo.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 \
gedit-plugins-data \
typelib(GObject) \
typelib(Gdk) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(Peas) \
typelib(PeasGtk) \
typelib(Tepl)"

inherit rpm
