SUMMARY = "On-screen Keyboard for GNOME -- GTK+ 3 Module"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk3-module-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "13f4817405d23290f2f88ede617b2127a1e79932fd5f09dd9bfc34ea58f387b0ecf666828c3e10763507b3ca7ed5e619f8b3ab03891c1cbfef7a501955bf2137"

RPROVIDES:${PN} += "caribou-gtk3-module \
libcaribou-gtk-module.so"

RDEPENDS:${PN} += "caribou \
caribou-gtk-module-common \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
