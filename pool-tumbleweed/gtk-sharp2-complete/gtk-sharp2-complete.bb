SUMMARY = "GTK+ and GNOME bindings for Mono (virtual package)"
DESCRIPTION = "Gtk# is a library that allows you to build fully native graphical GNOME \
applications using Mono. Gtk# is a binding to GTK+, the cross platform \
user interface toolkit used in GNOME. It includes bindings for Gtk, \
Atk, Pango, Gdk, libgnome, libgnomeui and libgnomecanvas.  (Virtual \
package which depends on all gtk-sharp2 subpackages)"
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-complete-2.12.45-3.9.aarch64.rpm"
RPM_HASH = "851260897be32d2d3574d66aff1aabefcc9727261456f8591a9efc7668353d11d34360894dba916325cffe42b32b9bad3241dd11bf104ae0d7beaa7639c037b7"

RPROVIDES:${PN} += "gtk-sharp2-complete"

RDEPENDS:${PN} += "glade-sharp2 \
glib-sharp2 \
gtk-sharp2 \
gtk-sharp2-doc \
gtk-sharp2-gapi"

inherit rpm
