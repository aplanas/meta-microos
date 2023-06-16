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

RPM_NAME = "variety-0.8.10-1.1.noarch.rpm"
RPM_HASH = "094fc75efe36a1b1be36f08eae35dadfefd18a553e2b7486c24d5e5062589aa5d09027705f4603ca372a9ef3ae49bd01dec986b57de6a75afb34ecdf2cae234a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-variety \
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
