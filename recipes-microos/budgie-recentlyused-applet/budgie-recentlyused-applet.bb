SUMMARY = "Recently Used applet"
DESCRIPTION = "Show (Gtk applications') recently used items in a menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-recentlyused-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "61077deb96b8574f58b846d0a0b1255e7ac2f87bce27297438b1bc71b71d91d8c3d93388de2af0f44d828c40af2c79720acf91da3792f213dd8f2efe9c6fe215"

RPROVIDES:${PN} += "budgie-recentlyused-applet \
budgie-recentlyused-applet(aarch-64) \
libbudgie-recentlyused.so()(64bit)"
RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbudgie-plugin.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
xdg-utils"

inherit rpm
