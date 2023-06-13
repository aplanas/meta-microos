SUMMARY = "Document Viewer, Mobile UI"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This contains the UI targeted at mobile devices with a \
touch screen."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "okular-mobile-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "999e141f6625a5c49f72ad9ab8c3888f1eeabef8f9c2b5f6f5437ac81f2ed61c8c3689587d784d92ca6b0c89a4e7cc04cdcb54162154d572ce7883fa17481afb"

RPROVIDES:${PN} += "application() \
application(org.kde.mobile.okular_chm.desktop) \
application(org.kde.mobile.okular_comicbook.desktop) \
application(org.kde.mobile.okular_djvu.desktop) \
application(org.kde.mobile.okular_dvi.desktop) \
application(org.kde.mobile.okular_epub.desktop) \
application(org.kde.mobile.okular_fax.desktop) \
application(org.kde.mobile.okular_fb.desktop) \
application(org.kde.mobile.okular_ghostview.desktop) \
application(org.kde.mobile.okular_kimgio.desktop) \
application(org.kde.mobile.okular_md.desktop) \
application(org.kde.mobile.okular_mobi.desktop) \
application(org.kde.mobile.okular_pdf.desktop) \
application(org.kde.mobile.okular_plucker.desktop) \
application(org.kde.mobile.okular_tiff.desktop) \
application(org.kde.mobile.okular_txt.desktop) \
application(org.kde.mobile.okular_xps.desktop) \
application(org.kde.okular.kirigami.desktop) \
libokularplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.okular.kirigami.appdata.xml) \
mimehandler(application/epub+zip) \
mimehandler(application/oxps) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(application/prs.plucker) \
mimehandler(application/vnd.ms-xpsdocument) \
mimehandler(application/x-bzdvi) \
mimehandler(application/x-bzpdf) \
mimehandler(application/x-bzpostscript) \
mimehandler(application/x-cb7) \
mimehandler(application/x-cbr) \
mimehandler(application/x-cbt) \
mimehandler(application/x-cbz) \
mimehandler(application/x-chm) \
mimehandler(application/x-dvi) \
mimehandler(application/x-fictionbook+xml) \
mimehandler(application/x-gzdvi) \
mimehandler(application/x-gzpdf) \
mimehandler(application/x-gzpostscript) \
mimehandler(application/x-mobipocket-ebook) \
mimehandler(application/x-wwf) \
mimehandler(image/avif) \
mimehandler(image/bmp) \
mimehandler(image/fax-g3) \
mimehandler(image/g3fax) \
mimehandler(image/gif) \
mimehandler(image/heif) \
mimehandler(image/jp2) \
mimehandler(image/jpeg) \
mimehandler(image/jxl) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/vnd.djvu) \
mimehandler(image/webp) \
mimehandler(image/x-bzeps) \
mimehandler(image/x-dds) \
mimehandler(image/x-eps) \
mimehandler(image/x-exr) \
mimehandler(image/x-gzeps) \
mimehandler(image/x-hdr) \
mimehandler(image/x-ico) \
mimehandler(image/x-pcx) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-psd) \
mimehandler(image/x-rgb) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap) \
mimehandler(text/markdown) \
mimehandler(text/plain) \
mimehandler(video/x-mng) \
okular-mobile \
okular-mobile(aarch-64) \
qt5qmlimport(org.kde.okular.2)"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libOkular5Core.so.10()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
okular \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.okular.2)"

inherit rpm
