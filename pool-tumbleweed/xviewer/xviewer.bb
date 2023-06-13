SUMMARY = "Fast and functional graphics viewer"
DESCRIPTION = "xviewer is a simple graphics viewer for the Cinnamon desktop and \
others which uses the gdk-pixbuf library. It can deal with large \
images, and zoom and scroll with constant memory usage. Its goals \
are simplicity and standards compliance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "xviewer-3.2.4-1.7.aarch64.rpm"
RPM_HASH = "8791d24584347ec36764ca0ea98ad421d8daad1addfd8c0d857c5196255f2b0fe960ac087484b74d5fa5faf8231d0ed830c5c802ffe4b8258fbf70f06b302262"

RPROVIDES:${PN} += "application() \
application(xviewer.desktop) \
libxviewer.so()(64bit) \
metainfo() \
metainfo(xviewer.appdata.xml) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/tiff) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-gray) \
mimehandler(image/x-icb) \
mimehandler(image/x-ico) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
typelib(Xviewer) \
xviewer \
xviewer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcinnamon-desktop.so.4()(64bit) \
libexempi.so.8()(64bit) \
libexif.so.12()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libxapp.so.1()(64bit) \
libz.so.1()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib) \
xapps-common"

inherit rpm
