SUMMARY = "GPaste status menu extension for GNOME Shell"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This GNOME Shell extension adds a clipboard item in the status \
menu, and provides the ability to copy/paste text."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gnome-shell-extension-gpaste-43.2+6-2.2.noarch.rpm"
RPM_HASH = "f9dd47618388eb553e7692f5c78b516d90006aace088774bbb79786ccf0c61ab424f944ce06956abb4c2b906c3ae3235693537e8a6eeccb5a5accb183c7be613"
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
