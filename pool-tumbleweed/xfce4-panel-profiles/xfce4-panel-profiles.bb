SUMMARY = "Simple application to manage Xfce panel layouts"
DESCRIPTION = "Simple application to manage Xfce panel layouts. \
 \
This tool makes it possible to backup, restore, import, and export panel layouts."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "xfce4-panel-profiles-1.0.14-1.1.noarch.rpm"
RPM_HASH = "187f2b648b30e349b44327dd43a5365efb50390a775688df7952256e20be7af3d8084e4c31dd9d013688dfe10fa237a35fbd9c206188ecb2ca30a0cd56b6afd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfce4-panel-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
python3 \
python3-base \
python3-gobject \
python3-gobject-Gdk \
python3-psutil \
typelib-GLib \
typelib-Gio \
typelib-Gtk \
typelib-Libxfce4ui \
typelib-Libxfce4util \
xfce4-panel"

inherit rpm
