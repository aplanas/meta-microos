SUMMARY = "GTK based greeter for greetd"
DESCRIPTION = "GTK based greeter for greetd, to be run under cage or similar."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "gtkgreet-0.7-2.3.aarch64.rpm"
RPM_HASH = "39dc5d78c2e44bb4addb329f52020d3e8bdf1030af2c41b93ee52ca4a514e26837ac1b64c4c5fdfd292266cab48c92c117b79ac8954f27e5a56d81b9992893da"

RPROVIDES:${PN} += "gtkgreet"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libjson-c.so.5"

inherit rpm
