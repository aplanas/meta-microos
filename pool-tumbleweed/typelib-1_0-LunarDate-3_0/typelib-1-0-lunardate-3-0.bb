SUMMARY = "Chinese Lunar calendar introspection bindings"
DESCRIPTION = "Introspection bindings for Chinese Lunar calendar for use in Gnome Shell"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "typelib-1_0-LunarDate-3_0-2.9.3-2.15.aarch64.rpm"
RPM_HASH = "ef749d191303ba132a6734b7ad4898959d4df9cda980dcdf948e32af1c1707157f17f78706e7287ea315c2a0c4217a7c2e97fd204e7d1f3b7cb25fba1935b4c0"

RPROVIDES:${PN} += "typelib-1-0-LunarDate-3-0 \
typelib-LunarDate"

RDEPENDS:${PN} += "liblunar-date-3.0.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
