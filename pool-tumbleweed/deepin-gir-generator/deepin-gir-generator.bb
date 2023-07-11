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

RPM_NAME = "deepin-gir-generator-2.1.0-1.11.aarch64.rpm"
RPM_HASH = "8bcbdbb8ae0e344da888684840cd5e4b7ec60bb4e7953b268304002f5c2d7abee79c930338a00941d8eb76f75a95de99d657c74ceb60c607e5c33bb46c29e441"

RPROVIDES:${PN} += "deepin-gir-generator \
go-gir-generator"

RDEPENDS:${PN} += "libc.so.6 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0"

inherit rpm
