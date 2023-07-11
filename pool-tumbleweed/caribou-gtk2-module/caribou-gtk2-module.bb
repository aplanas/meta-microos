SUMMARY = "On-screen Keyboard for GNOME -- GTK+ 2 Module"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk2-module-0.4.21-8.8.aarch64.rpm"
RPM_HASH = "b0b2e9b81be0b9b9f8f1f43a947a6b40fe5af20f4ba4d9b97362568e5ffc25195e9f500fdf52f74a77660fd368f7a726fac977411ed20d3931d2836a0ed1bdef"

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
