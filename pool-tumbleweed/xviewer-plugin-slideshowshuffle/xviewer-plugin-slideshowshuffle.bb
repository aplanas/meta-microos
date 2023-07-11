SUMMARY = "Xviewer slideshowshuffle plugin"
DESCRIPTION = "xviewer Slideshow Shuffle plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-slideshowshuffle-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "f1b820a673806170d5f7fdb18a19bb50f81aec59f31c7c332b8d1a92e2fbe3c371b90d82077d0f215738bd48ad5c08ca6911def6c05ab9bc6f5929e77f2a1124"

RPROVIDES:${PN} += "xviewer-plugin-slideshowshuffle \
xviewer-plugins-/usr/lib64/xviewer/plugins/slideshowshuffle.plugin"

RDEPENDS:${PN} += "typelib-GObject \
typelib-Gtk \
typelib-Xviewer \
xviewer-plugins-data"

inherit rpm
