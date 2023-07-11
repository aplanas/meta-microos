SUMMARY = "Recently Used applet"
DESCRIPTION = "Show (Gtk applications') recently used items in a menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-recentlyused-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "13748380012376d395a61eccdd3f716b5ecfffecf23b7e4e14f4ac8e6561f632f77d08a9601d695c5faa779368f9749337e50d89a4c229796449dc679cd697ee"

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
