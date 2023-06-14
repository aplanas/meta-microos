SUMMARY = "Weather App for GNOME"
DESCRIPTION = "GNOME 3 weather app that does: \
 \
  * Display current conditions; \
  * Display forecasts; \
  * Show radar maps; \
  * Notify on hazardous weather conditions."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-weather-44.0-2.1.noarch.rpm"
RPM_HASH = "1eb1209fccdb203e915b6be0e5244c10400f875f862db95652cda534a089ad2590d5e9b68ff395c13a789d69f60c6320b90f00476fd360361ace22cc6ab484c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-weather"

RDEPENDS:${PN} += "/usr/bin/gjs-console \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-GWeather \
typelib-Gdk \
typelib-Geoclue \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk"

inherit rpm
