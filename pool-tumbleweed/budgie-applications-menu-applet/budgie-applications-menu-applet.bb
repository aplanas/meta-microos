SUMMARY = "Stylish Applications Menu for Budgie-Desktop"
DESCRIPTION = "The application-menu is a stylish panel applet that displays applications \
in different views - grid and list. Weblinks typed into the search bar \
can be opened in your default browser. Applications that have additional \
desktop options show via a right-click menu. Applications with associated \
actions show those actions are additional searchable entries."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-applications-menu-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "0a497b47d666e415cd594308cc6ad00fda7f0450b11d582a4780bea7bb26bbd9de82e06e15bfe852afd0673bd8aeb589fa67cae1cbc3c88193790d38bfd2da6d"

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
