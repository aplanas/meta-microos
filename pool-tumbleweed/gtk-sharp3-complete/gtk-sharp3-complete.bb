SUMMARY = "GTK+ and GNOME bindings for Mono (virtual package)"
DESCRIPTION = "Gtk-Sharp is a library that allows you to build fully native graphical GNOME \
applications using Mono. Gtk-Sharp is a binding to GTK+, the cross platform \
user interface toolkit used in GNOME. It includes bindings for Gtk, Atk, \
Pango, Gdk, libgnome, libgnomeui and libgnomecanvas. This is a virtual \
package which depends on all gtk-sharp3 subpackages)"
LICENSE = "LGPL-2.1-only"

PV = "2.99.4"

RPM_NAME = "gtk-sharp3-complete-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "0ce6420f4dd8594aeaf24e66e7ec0557ec8ecf179a200c85f1ad5b3a8fdbf8ec0227055c9cb63090c96d5fdaa58f4598c185eb3d1170e774534f9df4f877e41d"

RPROVIDES:${PN} += "gtk-sharp3-complete \
gtk-sharp3-complete(aarch-64)"

RDEPENDS:${PN} += "glib-sharp3 \
gtk-sharp3 \
gtk-sharp3-doc \
gtk-sharp3-gapi"

inherit rpm
