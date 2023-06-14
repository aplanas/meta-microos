SUMMARY = "On-screen Keyboard for GNOME -- GTK+ 2 Module"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk2-module-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "1b21dd68258b8af01084b86c963d8450c90a5312ac4a9c8cbaec77d3baf606ee760de480599807128cb9142b856535b22d5abec14df909f654e1a7aae9177e7a"

RPROVIDES:${PN} += "caribou-gtk2-module \
libcaribou-gtk-module.so"

RDEPENDS:${PN} += "caribou \
caribou-gtk-module-common \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
