SUMMARY = "Wallpaper manager for Sway, i3 and some other WMs"
DESCRIPTION = "Azote is a GTK+ 3-based picture browser and a wallpaper setter, as the frontend to the swaybg (Sway/Wayland) and feh (X windows) commands."
LICENSE = "GPL-3.0-only"

PV = "1.12.2"

RPM_NAME = "azote-1.12.2-1.1.noarch.rpm"
RPM_HASH = "6f7d124ac2b6cc00304a731bdbe58b405d9579915ca9c9c2f4fdd273e8bf9f3144af0617f910860c8726c86db062e365fae4bb2aa29bb9bfd0dcffd8348dd858"
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
