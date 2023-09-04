SUMMARY = "Common files for GNOME's printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides files common to various binaries."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-common-1.5.18-3.1.noarch.rpm"
RPM_HASH = "ab6b123e95f23a76176a10299b6544105154ad8e0af563d41e6bae8d1ae4332cffc97cba769b3dbcf3b9249ea2761008c3374b83437e3f2e93ad77719472ab7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "system-config-printer-common"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
python3-cairo \
python3-cups \
python3-cupshelpers \
python3-gobject \
python3-gobject-Gdk \
python3-smbc \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Handy \
typelib-Notify \
typelib-PackageKitGlib \
typelib-Pango \
typelib-Polkit \
typelib-Secret"

inherit rpm
