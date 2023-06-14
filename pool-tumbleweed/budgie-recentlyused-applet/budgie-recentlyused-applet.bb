SUMMARY = "Recently Used applet"
DESCRIPTION = "Show (Gtk applications') recently used items in a menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-recentlyused-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "61077deb96b8574f58b846d0a0b1255e7ac2f87bce27297438b1bc71b71d91d8c3d93388de2af0f44d828c40af2c79720acf91da3792f213dd8f2efe9c6fe215"

RPROVIDES:${PN} += "budgie-recentlyused-applet \
libbudgie-recentlyused.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
xdg-utils"

inherit rpm
