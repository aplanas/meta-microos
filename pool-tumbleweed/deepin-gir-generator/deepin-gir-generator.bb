SUMMARY = "Go-gir-generator imeplement static golang bindings for GObject"
DESCRIPTION = "Go-gir-generator imeplement static golang bindings for GObject. \
 \
There has many go bindings for GObject/Gtk libraries, but almost all of them \
are written by hand. It's bored and error-prone when the binding C libaray \
changed. \
 \
Go-gir-geneator's object is like python-gobject's that binding the newest \
library without need change binding codes. \
 \
Currently it only official support Gobject-2.0, Glib-2.0, Gio-2.0. Because \
generate the gdkpixbuf binding hasn't completed, so Gdk/Gtk were also in blocking."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "deepin-gir-generator-2.1.0-1.10.aarch64.rpm"
RPM_HASH = "eea34aab4cee078458105850ee0eaf8c4019be5c72bf28eac6a1027c0fb5ab0466b8968e7ed89796d68b1d7b98f1d6ea92020b5f4a53db24741a24d2658669b7"

RPROVIDES:${PN} += "deepin-gir-generator \
deepin-gir-generator(aarch-64) \
go-gir-generator"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
