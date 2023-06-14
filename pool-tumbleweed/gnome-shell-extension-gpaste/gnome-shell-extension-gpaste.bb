SUMMARY = "GPaste status menu extension for GNOME Shell"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This GNOME Shell extension adds a clipboard item in the status \
menu, and provides the ability to copy/paste text."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gnome-shell-extension-gpaste-43.2+6-2.1.noarch.rpm"
RPM_HASH = "2f0a3bd10cc3385372807618e50f39666df19d53e6165ab95598820e178450648cd6756e7af164af549afed0d0eb390effd711536cd7e8b5b52ecf8ced06b5a5"
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
