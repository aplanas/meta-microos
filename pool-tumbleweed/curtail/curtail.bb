SUMMARY = "A simple and useful image compressor"
DESCRIPTION = "Curtail (previously ImCompressor) is an useful image compressor, supporting \
PNG, JPEG and WEBP file types. It support both lossless and lossy compression \
modes with an option to whether keep or not metadata of images."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "curtail-1.7.0-1.1.noarch.rpm"
RPM_HASH = "773628b1916b9e6077ced84367a13d4dfea7b065b4a05e8ea62ef6d53076aeaf2bf8e0fcff1216baef60c40b8450069eb41eed09dd526494f4fa00b796a607e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "curtail"

RDEPENDS:${PN} += "/usr/bin/python3 \
jpegoptim \
libwebp-tools \
optipng \
pngquant \
python3-gobject-Gdk \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk"

inherit rpm
