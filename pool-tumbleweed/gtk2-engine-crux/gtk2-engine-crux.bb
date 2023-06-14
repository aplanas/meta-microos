SUMMARY = "Crux GTK+ 2 Theme Engine"
DESCRIPTION = "The Crux engine was a popular theme in the early GNOME 2 days."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-crux-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "c1675fe096b8057ab44d11be098df5f8285664a3e318fd69c71d4965a1ff6d5b35eb9ec1f595ee2cf6623b7a3f26a9591c7a794d2a68ab5f62d29b66305fdad7"

RPROVIDES:${PN} += "gtk2-engine-crux \
libcrux-engine.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
