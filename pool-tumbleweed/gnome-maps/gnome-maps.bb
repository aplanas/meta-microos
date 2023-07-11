SUMMARY = "Maps Application for GNOME"
DESCRIPTION = "Maps is a maps application for GNOME 3. It allows viewing street maps from \
OpenStreetMaps and satellite imagery from Mapbox. You can also get directions \
for your journeys, whether on foot, by bike, or by car."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-maps-44.3-1.1.aarch64.rpm"
RPM_HASH = "72b47ce32af34b454649bfc4a18fcc781b1317cf10aa55c31cbb45934503af2b87ae0fd611a2a04071c7208aea1b82ba053dd4d74531e99401abe9ade0ec9065"

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
