SUMMARY = "A collection of extensions for Gnome-shell classic"
DESCRIPTION = "This GNOME Shell extension adds a power off item in the status \
menu, and provides the ability to hibernate. \
 \
This package provides the extensions required to switch to \
gnome-shell classic."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-classic-44.0-1.1.noarch.rpm"
RPM_HASH = "e07cd59cba568d5fafc21f8b26557280ea94560c3e0740d80899d36da1d2c5399b4c6452b69a5b5a4c9ba3125ccd127ba892f850c9ffa81435209845afd90c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-classic"

RDEPENDS:${PN} += "gnome-shell-extension-desktop-icons \
gnome-shell-extensions-common \
typelib(Adw) \
typelib(Atk) \
typelib(Clutter) \
typelib(GLib) \
typelib(GMenu) \
typelib(GObject) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(Shell) \
typelib(St)"

inherit rpm
