SUMMARY = "Crux GTK+ 2 Theme Engine"
DESCRIPTION = "The Crux engine was a popular theme in the early GNOME 2 days."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-crux-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "edc8da16a7fc7b4eecbc93a5bf766b79f93eef3a21ed7b00420d97d4bf27886bebecdcfcf58a5f494518375feb0441064ed643cca6cfe1696967e9279a7e1fe7"

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
