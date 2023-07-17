SUMMARY = "Wallpaper manager for Sway, i3 and some other WMs"
DESCRIPTION = "Azote is a GTK+ 3-based picture browser and a wallpaper setter, as the frontend to the swaybg (Sway/Wayland) and feh (X windows) commands."
LICENSE = "GPL-3.0-only"

PV = "1.12.3"

RPM_NAME = "azote-1.12.3-1.1.noarch.rpm"
RPM_HASH = "44290a38d74c795b941a6175065bef4a1d2c364d65930357544347054139e3da5ff850eeb2efaac0c0310d4ed302a6de04b8580e9d87a1d82eb8a82f20b39307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azote \
python3.11dist-azote \
python3dist-azote"

RDEPENDS:${PN} += "/usr/bin/sh \
ImageMagick \
feh \
python-abi \
python3-Pillow \
python3-PyYAML \
python3-Send2Trash \
python3-gobject \
python3-gobject-Gdk \
typelib-AppIndicator3 \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
wget \
wmctrl \
xrandr"

inherit rpm
