SUMMARY = "On-screen Keyboard for GNOME -- GTK+ 2 Module"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk2-module-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "1b21dd68258b8af01084b86c963d8450c90a5312ac4a9c8cbaec77d3baf606ee760de480599807128cb9142b856535b22d5abec14df909f654e1a7aae9177e7a"

RPROVIDES:${PN} += "caribou-gtk2-module caribou-gtk2-module(aarch-64) libcaribou-gtk-module.so()(64bit)"
RDEPENDS:${PN} += "caribou caribou-gtk-module-common ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
