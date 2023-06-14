SUMMARY = "Maps Application for GNOME"
DESCRIPTION = "Maps is a maps application for GNOME 3. It allows viewing street maps from \
OpenStreetMaps and satellite imagery from Mapbox. You can also get directions \
for your journeys, whether on foot, by bike, or by car."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-maps-44.2-1.1.aarch64.rpm"
RPM_HASH = "78808135327ca3c41b5eaec10560395e9cd03d5a0f19365a7f60df86b2d74a6e145038673939e3a25622c1240f4e26ede83765340b932a0f5d100a2af2497920"

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
