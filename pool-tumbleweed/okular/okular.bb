SUMMARY = "Document Viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "okular-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "845e0f7dd6b26a7199bbfc553c0c07f08fcbbebc72e970d0004154a0dcf4753a5f64a33f7b7b94af5681ca28b3ee80ad373a7994e4509ef62a8311d91378b98e"

RPROVIDES:${PN} += "libOkular5Core.so.11 \
okular \
okular5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KExiv2.so.15.0.0 \
libKF5KHtml.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Pty.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5TextWidgets.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Svg.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libchm.so.0 \
libdjvulibre.so.21 \
libepub.so.0 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libmarkdown.so.3 \
libphonon4qt5.so.4 \
libpoppler-qt5.so.1 \
libqmobipocket.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1 \
libzip.so.5"

inherit rpm
