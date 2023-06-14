SUMMARY = "Digital Painting Application"
DESCRIPTION = "Krita is a painting program. It supports concept art, texture and \
matte painters, as well as illustrations and comics."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.1.5"

RPM_NAME = "krita-5.1.5-1.6.aarch64.rpm"
RPM_HASH = "62d314fd9594a73a8dbc49cd571229de31bf80dc8de6e84cf35881b2513566ba0bca0f7fd8893c0f18bd4a4df5fd6509af0800d6504ca82b6b9d957fcf2f2b66"

RPROVIDES:${PN} += "calligra-krita \
config-krita \
krita \
libdraganddropplugin.so \
libkritabasicflakes.so.18 \
libkritacolor.so.18 \
libkritacolord.so.18 \
libkritacommand.so.18 \
libkritaexifcommon.so.18 \
libkritaflake.so.18 \
libkritaglobal.so.18 \
libkritaimage.so.18 \
libkritaimpex.so.18 \
libkritalibbrush.so.18 \
libkritalibkis.so.18 \
libkritalibkra.so.18 \
libkritalibpaintop.so.18 \
libkritametadata.so.18 \
libkritapigment.so.18 \
libkritaplugin.so.18 \
libkritapsd.so.18 \
libkritapsdutils.so.18 \
libkritaqmicinterface.so.18 \
libkritaqml.so.18 \
libkritaresources.so.18 \
libkritaresourcewidgets.so.18 \
libkritasketchplugin.so \
libkritastore.so.18 \
libkritatiffpsd.so.18 \
libkritaui.so.18 \
libkritaversion.so.18 \
libkritawidgets.so.18 \
libkritawidgetutils.so.18 \
qt5qmlimport-org.krita.draganddrop.1 \
qt5qmlimport-org.krita.sketch.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKSeExpr.so.4 \
libKSeExprUI.so.4 \
libOpenColorIO.so.2.1 \
libOpenEXR-3-1.so.30 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libc.so.6 \
libexiv2.so.27 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgif.so.7 \
libgsl.so.27 \
libgslcblas.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
libm.so.6 \
libmypaint.so.0 \
libopenjp2.so.7 \
libpng16.so.16 \
libpoppler-qt5.so.1 \
libpython3.10.so.1.0 \
libquazip1-qt5.so.1.4.0 \
libraw.so.23 \
libstdc++.so.6 \
libtiff.so.6 \
libturbojpeg.so.0 \
libwebp.so.7 \
libz.so.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-org.krita.sketch.1"

inherit rpm
