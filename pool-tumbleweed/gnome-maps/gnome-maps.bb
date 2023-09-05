SUMMARY = "Maps Application for GNOME"
DESCRIPTION = "Maps is a maps application for GNOME 3. It allows viewing street maps from \
OpenStreetMaps and satellite imagery from Mapbox. You can also get directions \
for your journeys, whether on foot, by bike, or by car."
LICENSE = "GPL-2.0-or-later"

PV = "44.4"

RPM_NAME = "gnome-maps-44.4-1.1.aarch64.rpm"
RPM_HASH = "5677766b5c6a4fb6811f4cfd2be4b3513cba18f2d156859e950c20ad46499a81bc6456bd750e444c60609bb5b4d8d29c30f2becb893e8cc0e9e292752854899f"

RPROVIDES:${PN} += "gnome-maps \
libgnome-maps.so.0 \
typelib-GnomeMaps"

RDEPENDS:${PN} += "/usr/bin/gjs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libshumate-1.0.so.1 \
libxml2.so.2 \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GWeather \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Geoclue \
typelib-GeocodeGlib \
typelib-Gio \
typelib-GnomeMaps \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-Rest \
typelib-Secret \
typelib-Shumate \
typelib-Soup \
typelib-cairo \
typelib-freetype2"

inherit rpm
