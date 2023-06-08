SUMMARY = "Eog slideshowshuffle plugin"
DESCRIPTION = "The Eye of Gnome Slideshow Shuffle plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-slideshowshuffle-44.0-1.1.aarch64.rpm"
RPM_HASH = "1d6e072f797d2d102a4aaaaadadb9e8d3111b53a313f16882c61db7dceb6f283d2b1a62a5a7aab4b3df5cb30ab45a7f3192b9ce8adda2dbedaf07b798d13ffe6"

RPROVIDES:${PN} += "eog-plugin-slideshowshuffle eog-plugin-slideshowshuffle(aarch-64) eog-plugins:/usr/lib64/eog/plugins/slideshowshuffle.plugin metainfo() metainfo(eog-slideshowshuffle.appdata.xml)"
RDEPENDS:${PN} += "eog-plugins-data typelib(Eog) typelib(GObject) typelib(Gtk)"

inherit rpm
