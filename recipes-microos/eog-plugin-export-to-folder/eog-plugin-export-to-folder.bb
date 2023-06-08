SUMMARY = "Eog export to folder plugin"
DESCRIPTION = "The Eye of Gnome export to folder plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-export-to-folder-44.0-1.1.aarch64.rpm"
RPM_HASH = "44631ee3d01bab5844891a17689907d00dfd9ad43109cf1dd45d7f2aa14f1b57df94540f944275890671b2cdc012edfcb0a5695ee650b79772c2a6b0a422896a"

RPROVIDES:${PN} += "eog-plugin-export-to-folder eog-plugin-export-to-folder(aarch-64) eog-plugins:/usr/lib64/eog/plugins/export-to-folder.plugin metainfo() metainfo(eog-export-to-folder.appdata.xml)"
RDEPENDS:${PN} += "eog-plugins-data typelib(Eog) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Gtk) typelib(PeasGtk)"

inherit rpm
