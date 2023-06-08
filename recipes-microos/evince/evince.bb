SUMMARY = "GNOME Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
Separate plugin packages, e.g. evince-plugin-pdfdocument, need to be present \
for certain formats to be recognized."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-44.1-1.1.aarch64.rpm"
RPM_HASH = "f76943a41fb92ba61351b6091ef3f0d3d60b42d843025f71025577d6ff4d42658f21ce758d12ad81c7268f01b7de3c67e5598ab669b2d7a2a8b3e5e7a4ea4d31"

RPROVIDES:${PN} += "application() application(org.gnome.Evince-previewer.desktop) application(org.gnome.Evince.desktop) evince evince(aarch-64) evince-browser-plugin metainfo() metainfo(org.gnome.Evince.appdata.xml) mimehandler(application/illustrator) mimehandler(application/oxps) mimehandler(application/pdf) mimehandler(application/postscript) mimehandler(application/vnd.comicbook+zip) mimehandler(application/vnd.comicbook-rar) mimehandler(application/vnd.ms-xpsdocument) mimehandler(application/x-bzdvi) mimehandler(application/x-bzpdf) mimehandler(application/x-bzpostscript) mimehandler(application/x-cb7) mimehandler(application/x-cbr) mimehandler(application/x-cbt) mimehandler(application/x-cbz) mimehandler(application/x-dvi) mimehandler(application/x-ext-cb7) mimehandler(application/x-ext-cbr) mimehandler(application/x-ext-cbt) mimehandler(application/x-ext-cbz) mimehandler(application/x-ext-djv) mimehandler(application/x-ext-djvu) mimehandler(application/x-ext-dvi) mimehandler(application/x-ext-eps) mimehandler(application/x-ext-pdf) mimehandler(application/x-ext-ps) mimehandler(application/x-gzdvi) mimehandler(application/x-gzpdf) mimehandler(application/x-gzpostscript) mimehandler(application/x-xzpdf) mimehandler(image/tiff) mimehandler(image/vnd.djvu) mimehandler(image/x-bzeps) mimehandler(image/x-eps) mimehandler(image/x-gzeps)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libevdocument3.so.4()(64bit) libevview3.so.3()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-desktop-3.so.20()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libsecret-1.so.0()(64bit)"

inherit rpm
