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

RPM_NAME = "deepin-gir-generator-2.1.0-1.8.aarch64.rpm"
RPM_HASH = "7073ddd40808a4f7a0d46d288cdf997c80a35df53f243244ab8546bfe28089427975f7ec1c6bc009ba77bea7fefff0b2f0140882baf960ca5bf7278944224ac6"

RPROVIDES:${PN} += "deepin-gir-generator deepin-gir-generator(aarch-64) go-gir-generator"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgirepository-1.0.so.1()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
