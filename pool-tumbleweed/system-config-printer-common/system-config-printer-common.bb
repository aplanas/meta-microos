SUMMARY = "Common files for GNOME's printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides files common to various binaries."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-common-1.5.18-2.1.noarch.rpm"
RPM_HASH = "1e0a78e7ed913abee5cebe65c2f70e624664f5e124066807e524d28bb017c215ccc0abf7fb49369eb267a48b39810fa8be7dffee976dd5f3039d2bc137dbb8ae"
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
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gtk) \
typelib(Handy) \
typelib(Notify) \
typelib(PackageKitGlib) \
typelib(Pango) \
typelib(Polkit) \
typelib(Secret)"

inherit rpm
