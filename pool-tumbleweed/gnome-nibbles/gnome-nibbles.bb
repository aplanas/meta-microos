SUMMARY = "Worm Game for GNOME"
DESCRIPTION = "Nibbles is a worm game for GNOME. The player controls a 2D worm while \
trying to get food. Getting food gives points, but hitting anything \
causes a loss of points. When all points are lost, the player loses."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.3"

RPM_NAME = "gnome-nibbles-3.38.3-1.1.aarch64.rpm"
RPM_HASH = "9ac9fb85602e6030d1a8ceba678c031408ac68814c2edc40353e5ccbd6ffcf8a7e94c013adeae5c382c31e3e9ea1fe891f9cc7622e0e3b03d88eb575004d3685"

RPROVIDES:${PN} += "gnome-nibbles"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
