SUMMARY = "Wallpaper changer"
DESCRIPTION = "Variety changes the desktop wallpaper on a regular basis, using user-specified \
or automatically downloaded images. \
 \
Variety sits conveniently as an indicator in the panel and can be easily paused \
and resumed. The mouse wheel can be used to scroll wallpapers back and forth \
until you find the perfect one for your current mood. \
 \
Apart from displaying images from local folders, several different online sources \
can be used to fetch wallpapers according to user-specified criteria."
LICENSE = "GPL-3.0-only"

PV = "0.8.10"

RPM_NAME = "variety-0.8.10-1.2.noarch.rpm"
RPM_HASH = "1926b293fbd17f6b03df78fa164ba4cc327310f825f9f29872f6a2a8f588d8396d2dffdbf0844fc3af0b4ff54e104fd22dafd9d283a800c0096169cd21a16df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-variety \
python3dist-variety \
variety"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ImageMagick \
libnotify4 \
python-abi \
python3-Pillow \
python3-beautifulsoup4 \
python3-configobj \
python3-dbus-python \
python3-gexiv2 \
python3-gobject-Gdk \
python3-httplib2 \
python3-lxml \
python3-pycairo \
python3-pycurl \
python3-requests \
typelib-AppIndicator3 \
typelib-GExiv2 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
typelib-Pango \
typelib-PangoCairo \
yelp"

inherit rpm
