SUMMARY = "Wallpaper manager for Sway, i3 and some other WMs"
DESCRIPTION = "Azote is a GTK+ 3-based picture browser and a wallpaper setter, as the frontend to the swaybg (Sway/Wayland) and feh (X windows) commands."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "azote-1.12.0-1.1.noarch.rpm"
RPM_HASH = "df4f7aee403133fcd10f1eb5a869546f11ad8af513b9a6de9b3f051c9e8aa826c0f8912ed6bc05139c18607fc62c51f1a3875b805979131f79e628eb2a7f2fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(azote.desktop) \
azote \
python3.10dist(azote) \
python3dist(azote)"
RDEPENDS:${PN} += "/bin/sh \
ImageMagick \
feh \
python(abi) \
python3-Pillow \
python3-PyYAML \
python3-Send2Trash \
python3-gobject \
python3-gobject-Gdk \
typelib(AppIndicator3) \
typelib(GLib) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gtk) \
wget \
wmctrl \
xrandr"

inherit rpm
