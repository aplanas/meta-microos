SUMMARY = "Stylish Applications Menu for Budgie-Desktop"
DESCRIPTION = "The application-menu is a stylish panel applet that displays applications \
in different views - grid and list. Weblinks typed into the search bar \
can be opened in your default browser. Applications that have additional \
desktop options show via a right-click menu. Applications with associated \
actions show those actions are additional searchable entries."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-applications-menu-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "eca8bd96eb3f2eef67f3a6b1f71953ab1da4e1c8442a57ff033e7c97e6c62bd04272bd91cd3b735d3dad216279a173e3e9bc20cd7f4afa326978368e68379155"

RPROVIDES:${PN} += "budgie-applications-menu-applet \
libslingshot.so"

RDEPENDS:${PN} += "budgie-extras-lang \
gnome-menus \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libpeas-1.0.so.0 \
libplank.so.1"

inherit rpm
