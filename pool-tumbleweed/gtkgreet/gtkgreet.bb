SUMMARY = "GTK based greeter for greetd"
DESCRIPTION = "GTK based greeter for greetd, to be run under cage or similar."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "gtkgreet-0.7-2.3.aarch64.rpm"
RPM_HASH = "39dc5d78c2e44bb4addb329f52020d3e8bdf1030af2c41b93ee52ca4a514e26837ac1b64c4c5fdfd292266cab48c92c117b79ac8954f27e5a56d81b9992893da"

RPROVIDES:${PN} += "gtkgreet \
gtkgreet(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-layer-shell.so.0()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit)"

inherit rpm
