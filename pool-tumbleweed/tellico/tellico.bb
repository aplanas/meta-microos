SUMMARY = "A Collection Manager"
DESCRIPTION = "Tellico is an application for organizing your collections. It provides \
default templates for books, bibliographies, videos, music, video games, coins, \
stamps, trading cards, comic books, and wines."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tellico-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "686ee0e807f307636bd8385fae0b09f75470b45a7a432076e95fc442257d14085d86489ba3656dae2c45727607c91bf30b46733e6113ec468c17938dfc9174f0"

RPROVIDES:${PN} += "config-tellico \
tellico"

RDEPENDS:${PN} += "/usr/bin/dbus-send \
/usr/bin/env \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Cddb.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5FileMetaData.so.3 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Sane.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcdio.so.19 \
libcsv.so.3 \
libexempi.so.8 \
libexslt.so.0 \
libm.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libv4l1.so.0 \
libxml2.so.2 \
libxslt.so.1 \
libyaz.so.5"

inherit rpm
