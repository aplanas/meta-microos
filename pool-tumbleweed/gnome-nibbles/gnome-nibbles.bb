SUMMARY = "Worm Game for GNOME"
DESCRIPTION = "Nibbles is a worm game for GNOME. The player controls a 2D worm while \
trying to get food. Getting food gives points, but hitting anything \
causes a loss of points. When all points are lost, the player loses."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.3"

RPM_NAME = "gnome-nibbles-3.38.3-1.1.aarch64.rpm"
RPM_HASH = "9ac9fb85602e6030d1a8ceba678c031408ac68814c2edc40353e5ccbd6ffcf8a7e94c013adeae5c382c31e3e9ea1fe891f9cc7622e0e3b03d88eb575004d3685"

RPROVIDES:${PN} += "application() \
application(org.gnome.Nibbles.desktop) \
gnome-nibbles \
gnome-nibbles(aarch-64) \
metainfo() \
metainfo(org.gnome.Nibbles.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-games-support-1.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
