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
budgie-applications-menu-applet(aarch-64) \
libslingshot.so()(64bit)"
RDEPENDS:${PN} += "budgie-extras-lang \
gnome-menus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbudgie-plugin.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpeas-1.0.so.0()(64bit) \
libplank.so.1()(64bit)"

inherit rpm
