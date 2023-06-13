SUMMARY = "Digital Painting Application"
DESCRIPTION = "Krita is a painting program. It supports concept art, texture and \
matte painters, as well as illustrations and comics."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.1.5"

RPM_NAME = "krita-5.1.5-1.6.aarch64.rpm"
RPM_HASH = "62d314fd9594a73a8dbc49cd571229de31bf80dc8de6e84cf35881b2513566ba0bca0f7fd8893c0f18bd4a4df5fd6509af0800d6504ca82b6b9d957fcf2f2b66"

RPROVIDES:${PN} += "application() \
application(krita_brush.desktop) \
application(krita_csv.desktop) \
application(krita_exr.desktop) \
application(krita_gif.desktop) \
application(krita_heif.desktop) \
application(krita_heightmap.desktop) \
application(krita_jp2.desktop) \
application(krita_jpeg.desktop) \
application(krita_jxl.desktop) \
application(krita_kra.desktop) \
application(krita_krz.desktop) \
application(krita_ora.desktop) \
application(krita_pdf.desktop) \
application(krita_png.desktop) \
application(krita_psd.desktop) \
application(krita_qimageio.desktop) \
application(krita_raw.desktop) \
application(krita_spriter.desktop) \
application(krita_svg.desktop) \
application(krita_tga.desktop) \
application(krita_tiff.desktop) \
application(krita_webp.desktop) \
application(krita_xcf.desktop) \
application(org.kde.krita.desktop) \
calligra-krita \
config(krita) \
krita \
krita(aarch-64) \
libdraganddropplugin.so()(64bit) \
libkritabasicflakes.so.18()(64bit) \
libkritacolor.so.18()(64bit) \
libkritacolord.so.18()(64bit) \
libkritacommand.so.18()(64bit) \
libkritaexifcommon.so.18()(64bit) \
libkritaflake.so.18()(64bit) \
libkritaglobal.so.18()(64bit) \
libkritaimage.so.18()(64bit) \
libkritaimpex.so.18()(64bit) \
libkritalibbrush.so.18()(64bit) \
libkritalibkis.so.18()(64bit) \
libkritalibkra.so.18()(64bit) \
libkritalibpaintop.so.18()(64bit) \
libkritametadata.so.18()(64bit) \
libkritapigment.so.18()(64bit) \
libkritaplugin.so.18()(64bit) \
libkritapsd.so.18()(64bit) \
libkritapsdutils.so.18()(64bit) \
libkritaqmicinterface.so.18()(64bit) \
libkritaqml.so.18()(64bit) \
libkritaresources.so.18()(64bit) \
libkritaresourcewidgets.so.18()(64bit) \
libkritasketchplugin.so()(64bit) \
libkritastore.so.18()(64bit) \
libkritatiffpsd.so.18()(64bit) \
libkritaui.so.18()(64bit) \
libkritaversion.so.18()(64bit) \
libkritawidgets.so.18()(64bit) \
libkritawidgetutils.so.18()(64bit) \
metainfo() \
metainfo(org.kde.krita.appdata.xml) \
mimehandler(application/pdf) \
mimehandler(application/x-krita) \
mimehandler(application/x-krita-paintoppreset) \
mimehandler(image/avif) \
mimehandler(image/bmp) \
mimehandler(image/exr) \
mimehandler(image/gif) \
mimehandler(image/heic) \
mimehandler(image/jp2) \
mimehandler(image/jpeg) \
mimehandler(image/jpeg2000) \
mimehandler(image/jpeg2000-image) \
mimehandler(image/jpx) \
mimehandler(image/jxl) \
mimehandler(image/openraster) \
mimehandler(image/photoshop) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/vnd.adobe.photoshop) \
mimehandler(image/vnd.microsoft.icon) \
mimehandler(image/webp) \
mimehandler(image/x-adobe-dng) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-fuji-raf) \
mimehandler(image/x-gimp-brush) \
mimehandler(image/x-jpeg2000-image) \
mimehandler(image/x-kodak-dcr) \
mimehandler(image/x-kodak-k25) \
mimehandler(image/x-kodak-kdc) \
mimehandler(image/x-minolta-mrw) \
mimehandler(image/x-nikon-nef) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-panasonic-raw) \
mimehandler(image/x-panasonic-raw2) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-photoshop) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-psd) \
mimehandler(image/x-r16) \
mimehandler(image/x-scml) \
mimehandler(image/x-sigma-x3f) \
mimehandler(image/x-sony-arw) \
mimehandler(image/x-sony-sr2) \
mimehandler(image/x-sony-srf) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap) \
mimehandler(text/csv) \
qt5qmlimport(org.krita.draganddrop.1) \
qt5qmlimport(org.krita.sketch.1)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImath-3_1.so.29()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKSeExpr.so.4()(64bit) \
libKSeExprUI.so.4()(64bit) \
libOpenColorIO.so.2.1()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgif.so.7()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libheif.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libjxl_threads.so.0.8()(64bit) \
libjxl_threads.so.0.8(JXL_0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmypaint.so.0()(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpoppler-qt5.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libquazip1-qt5.so.1.4.0()(64bit) \
libraw.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libturbojpeg.so.0()(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.4)(64bit) \
libturbojpeg.so.0(TURBOJPEG_2.0)(64bit) \
libwebp.so.7()(64bit) \
libz.so.1()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(org.krita.sketch.1)"

inherit rpm
