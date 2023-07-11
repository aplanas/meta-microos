SUMMARY = "Eog slideshowshuffle plugin"
DESCRIPTION = "The Eye of Gnome Slideshow Shuffle plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-slideshowshuffle-44.0-1.2.aarch64.rpm"
RPM_HASH = "43f625e2c1b93c6c79b6be56f5448420e537decf2e725d2ba4a69469aa0a99c9461c0e7716c99f52e967dfcf02486a07cedff2fa3b89f86a3988330cc118ebd4"

RPROVIDES:${PN} += "eog-plugin-slideshowshuffle \
eog-plugins-/usr/lib64/eog/plugins/slideshowshuffle.plugin"

RDEPENDS:${PN} += "eog-plugins-data \
typelib-Eog \
typelib-GObject \
typelib-Gtk"

inherit rpm
