SUMMARY = "GPaste status menu extension for GNOME Shell"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This GNOME Shell extension adds a clipboard item in the status \
menu, and provides the ability to copy/paste text."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "gnome-shell-extension-gpaste-44.1-1.1.noarch.rpm"
RPM_HASH = "800505c796889c5081e21db41b8c182d18403655a7c926b6e20dd391c86ac1628950700c27b9c056e3813efb53c3318c8bb6f19f0c2c2a67d2eff77c3f7d1630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-gpaste"

RDEPENDS:${PN} += "gnome-shell \
gpaste \
typelib-GLib \
typelib-GObject \
typelib-GPaste \
typelib-GPasteGtk \
typelib-Gio \
typelib-Pango"

inherit rpm
