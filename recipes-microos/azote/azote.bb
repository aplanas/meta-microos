SUMMARY = "Wallpaper manager for Sway, i3 and some other WMs"
DESCRIPTION = "Azote is a GTK+ 3-based picture browser and a wallpaper setter, as the frontend to the swaybg (Sway/Wayland) and feh (X windows) commands."
LICENSE = "GPL-3.0-only"

PV = "1.11.0"

RPM_NAME = "azote-1.11.0-1.1.noarch.rpm"
RPM_HASH = "c432088f1cf57d3dda3e57e5b9c79a5c1abc93bf9d68b9babb3d1148572ec94fae5b8877e10de5bfc5ff4b90b3e51979cb73d6b7c1eda155ba6e6c080c5f4b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(azote.desktop) azote python3.10dist(azote) python3dist(azote)"
RDEPENDS:${PN} += "/bin/sh ImageMagick feh python(abi) python3-Pillow python3-PyYAML python3-Send2Trash python3-gobject python3-gobject-Gdk typelib(AppIndicator3) typelib(GLib) typelib(Gdk) typelib(GdkPixbuf) typelib(Gtk) wget wmctrl xrandr"

inherit rpm
