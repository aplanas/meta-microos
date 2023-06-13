SUMMARY = "Xviewer slideshowshuffle plugin"
DESCRIPTION = "xviewer Slideshow Shuffle plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-slideshowshuffle-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "c6abecfdbba10cd5778d9639d7ed82e78c2c27420c17c8490a5edee7f84e3f787565b070519403f69792610668c65970f4160aeb136c223d6c98b4b9bf9447d6"

RPROVIDES:${PN} += "metainfo() \
metainfo(xviewer-slideshowshuffle.metainfo.xml) \
xviewer-plugin-slideshowshuffle \
xviewer-plugin-slideshowshuffle(aarch-64) \
xviewer-plugins:/usr/lib64/xviewer/plugins/slideshowshuffle.plugin"

RDEPENDS:${PN} += "typelib(GObject) \
typelib(Gtk) \
typelib(Xviewer) \
xviewer-plugins-data"

inherit rpm
