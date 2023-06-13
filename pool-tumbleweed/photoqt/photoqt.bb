SUMMARY = "A Qt-based image viewer"
DESCRIPTION = "PhotoQt is a configurable image viewer."
LICENSE = "GPL-2.0-or-later"

PV = "3.1"

RPM_NAME = "photoqt-3.1-1.1.aarch64.rpm"
RPM_HASH = "eef7da4dfebddda3116d46590c7d223a37424aa83734f0852cd3483dca96e380bc58827a98b9dc86c6a058e6a54d9c80fda65bb8540ceaac962c89fbf5a4a247"

RPROVIDES:${PN} += "application() \
application(org.photoqt.PhotoQt.desktop) \
metainfo() \
metainfo(org.photoqt.PhotoQt.metainfo.xml) \
mimehandler(application/dicom) \
mimehandler(application/eps) \
mimehandler(application/mxf) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(application/vnd.ms-opentype) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-bzpdf) \
mimehandler(application/x-eps) \
mimehandler(application/x-fpt) \
mimehandler(application/x-gzpdf) \
mimehandler(application/x-krita) \
mimehandler(application/x-pdf) \
mimehandler(application/x-pnf) \
mimehandler(font/opentype) \
mimehandler(font/sfnt) \
mimehandler(image/avif) \
mimehandler(image/avif-sequence) \
mimehandler(image/bmp) \
mimehandler(image/bpg) \
mimehandler(image/dicom-rle) \
mimehandler(image/eps) \
mimehandler(image/fits) \
mimehandler(image/gif) \
mimehandler(image/heic) \
mimehandler(image/heif) \
mimehandler(image/jp2) \
mimehandler(image/jpeg) \
mimehandler(image/jpm) \
mimehandler(image/jpx) \
mimehandler(image/jxl) \
mimehandler(image/openraster) \
mimehandler(image/png) \
mimehandler(image/sgi) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/tiff-fx) \
mimehandler(image/vnd.adobe.photoshop) \
mimehandler(image/vnd.djvu) \
mimehandler(image/vnd.microsoft.icon) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/vnd.zbrush.pcx) \
mimehandler(image/webp) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-dpx) \
mimehandler(image/x-eps) \
mimehandler(image/x-exr) \
mimehandler(image/x-icon) \
mimehandler(image/x-miff) \
mimehandler(image/x-ms-bmp) \
mimehandler(image/x-mvg) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-pcx) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-arbitrarymap) \
mimehandler(image/x-portable-greymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-targa) \
mimehandler(image/x-tga) \
mimehandler(image/x-win-bitmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xbm) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap) \
mimehandler(image/x-xpmi) \
mimehandler(video/webm) \
mimehandler(video/x-jng) \
photoqt \
photoqt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libIL.so.1()(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libfreeimage.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpoppler-qt5.so.1()(64bit) \
libpugixml.so.1()(64bit) \
libraw.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
