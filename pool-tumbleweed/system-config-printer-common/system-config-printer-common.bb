SUMMARY = "Common files for GNOME's printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server. \
 \
This package provides files common to various binaries."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-common-1.5.18-2.2.noarch.rpm"
RPM_HASH = "5e7390376ef5479b1e17020a7d9b64ddc7f10a42e8c3adf7aa90df74e121067ee636c306b6269aaaa3272e0669a02178eac72b5f9bf983519fe38b6690582a34"
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
