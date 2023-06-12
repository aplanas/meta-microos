SUMMARY = "Image Viewer for GNOME"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. It can deal with large images, and \
zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "eog-44.2-1.1.aarch64.rpm"
RPM_HASH = "e9ac5d6e6d849ca91a7f480e05c777cd98e480661ad07560aa0e97d8035cf23eb2b6b8dbbad5c28d7a3e6c8220fcca5237b04ea9432f0cb6991459af8b74b6e1"

RPROVIDES:${PN} += "application() \
application(org.gnome.eog.desktop) \
eog \
eog(aarch-64) \
libeog.so()(64bit) \
libfullscreen.so()(64bit) \
libreload.so()(64bit) \
libstatusbar-date.so()(64bit) \
metainfo() \
metainfo(eog.appdata.xml) \
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
mimehandler(image/webp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-gray) \
mimehandler(image/x-icb) \
mimehandler(image/x-icns) \
mimehandler(image/x-ico) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
typelib(Eog)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libexempi.so.8()(64bit) \
libexif.so.12()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
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
typelib(xlib)"

inherit rpm
