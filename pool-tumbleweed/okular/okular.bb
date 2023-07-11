SUMMARY = "Document Viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "okular-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2df8d027f6c3b4ea7b8bb2b2a55dee0816b30a2857a751d59bb6144cf27e20046b055834c356263882da2d88371092908226fee83f772c63557ac136eda1defa"

RPROVIDES:${PN} += "libOkular5Core.so.10 \
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
libKF5JSApi.so.5 \
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
