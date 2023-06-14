SUMMARY = "Gedit codecomment plugin"
DESCRIPTION = "The gedit codecomment plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-codecomment-44.1-1.3.aarch64.rpm"
RPM_HASH = "54094ef84db4131398c740debf92b3ab9fc1afc97d209fa96b675747b526d4bcdc22237657b48b878dd7422991370f475df9b0600ba7aac6bbb0c66d0fd2d27c"

RPROVIDES:${PN} += "gedit-plugin-codecomment \
gedit-plugins-/usr/lib64/gedit/plugins/codecomment.plugin"

RDEPENDS:${PN} += "gedit-plugins-data \
typelib-GObject \
typelib-Gedit \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource"

inherit rpm
