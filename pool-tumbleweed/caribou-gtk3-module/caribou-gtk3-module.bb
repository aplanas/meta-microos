SUMMARY = "On-screen Keyboard for GNOME -- GTK+ 3 Module"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk3-module-0.4.21-8.8.aarch64.rpm"
RPM_HASH = "d8d20b6b91357796fe4f079ec32f11840fd0f82bbcb9a6a0b9f69d378eb39796c1f7968046d518060c2939ffbda8e0372af9cf60d4cccb0d5d054319cd55a37f"

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
