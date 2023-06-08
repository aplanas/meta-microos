SUMMARY = "MATE Desktop document viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "atril-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "587dd43a5ca44cf6049bffa8e22d2719f7f2a980646db5fc13063b5274e283c6e8edf0d8fa1228ce5f98dcdc0b6986de18f41bf7978d59c4ee3441cb4ceca344"

RPROVIDES:${PN} += "application() application(atril.desktop) atril atril(aarch-64) mate-document-viewer metainfo() metainfo(atril.appdata.xml) mimehandler(application/epub+zip) mimehandler(application/oxps) mimehandler(application/pdf) mimehandler(application/postscript) mimehandler(application/vnd-comicbook.rar) mimehandler(application/vnd.comicbook+zip) mimehandler(application/vnd.ms-xpsdocument) mimehandler(application/x-bzdvi) mimehandler(application/x-bzpdf) mimehandler(application/x-bzpostscript) mimehandler(application/x-cb7) mimehandler(application/x-cbr) mimehandler(application/x-cbt) mimehandler(application/x-cbz) mimehandler(application/x-dvi) mimehandler(application/x-gzdvi) mimehandler(application/x-gzpdf) mimehandler(application/x-gzpostscript) mimehandler(application/x-xzpdf) mimehandler(image/tiff) mimehandler(image/vnd.djvu) mimehandler(image/vnd.djvu+multipage) mimehandler(image/x-bzeps) mimehandler(image/x-eps) mimehandler(image/x-gzeps)"
RDEPENDS:${PN} += "atril-backends ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libatk-1.0.so.0()(64bit) libatrildocument.so.3()(64bit) libatrilview.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsecret-1.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) mate-desktop-gsettings-schemas"

inherit rpm
