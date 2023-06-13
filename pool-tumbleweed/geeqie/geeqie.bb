SUMMARY = "Lightweight Gtk+ based image viewer"
DESCRIPTION = "Geeqie is a lightweight image viewer for Linux, BSDs and compatibles."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "geeqie-2.0.1-2.1.aarch64.rpm"
RPM_HASH = "02b7dca2fdcd98cf98099d8245ee362cef0e4cf06770789b59ad740713c68c110b0ea5a79cdcd1ab44741400b5ff3012a456aee8c7b064c99c9fb1f36d722a34"

RPROVIDES:${PN} += "application() \
application(geeqie.desktop) \
geeqie \
geeqie(aarch-64) \
metainfo() \
metainfo(org.geeqie.Geeqie.appdata.xml) \
mimehandler(application/x-navi-animation) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/svg) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/x-MS-bmp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-ico) \
mimehandler(image/x-icon) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
mimehandler(image/xpm)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libchamplain-0.12.so.0()(64bit) \
libchamplain-gtk-0.12.so.0()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libdjvulibre.so.21()(64bit) \
libexiv2.so.27()(64bit) \
libffmpegthumbnailer.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libheif.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
liblcms2.so.2()(64bit) \
liblua5.3.so.5()(64bit) \
libm.so.6()(64bit) \
libopenjp2.so.7()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpoppler-glib.so.8()(64bit) \
libraw.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
update-desktop-files"

inherit rpm
