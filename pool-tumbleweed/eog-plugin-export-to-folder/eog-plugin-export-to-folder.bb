SUMMARY = "Eog export to folder plugin"
DESCRIPTION = "The Eye of Gnome export to folder plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-export-to-folder-44.0-1.2.aarch64.rpm"
RPM_HASH = "8211a0833db1433f761300a19ac79a901776d8bc094880b197b4e88367ba88daeda6c0932010f4c7635f810b7f82a182561a8d0a50b1a2d641af09af5836e887"

RPROVIDES:${PN} += "eog-plugin-export-to-folder \
eog-plugins-/usr/lib64/eog/plugins/export-to-folder.plugin"

RDEPENDS:${PN} += "eog-plugins-data \
typelib-Eog \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-PeasGtk"

inherit rpm
