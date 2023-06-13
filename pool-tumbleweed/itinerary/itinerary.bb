SUMMARY = "Itinerary and boarding pass management application"
DESCRIPTION = "Itinerary and boarding pass management application."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "itinerary-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "10146ac34cc73a98d3ffb06b99a45f53452a61032e726ffba59cbd7595fbb665beebefd79998d7c2139986c684f8ecc9025a9b4f1fdcabbf9e96a16e4625e1d7"

RPROVIDES:${PN} += "application() \
application(org.kde.itinerary.desktop) \
itinerary \
itinerary(aarch-64) \
libSolidExtras.so()(64bit) \
libsolidextrasqmlplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.itinerary.appdata.xml) \
mimehandler(application/json) \
mimehandler(application/ld+json) \
mimehandler(application/pdf) \
mimehandler(application/vnd.apple.pkpass) \
mimehandler(application/vnd.kde.itinerary) \
mimehandler(message/rfc822) \
mimehandler(text/calendar) \
mimehandler(text/html) \
qt5qmlimport(org.kde.solidextras.1)"

RDEPENDS:${PN} += "breeze5-icons \
ki18n-imports \
kirigami2 \
kopeninghours \
kosmindoormap \
kpublictransport \
ld-linux-aarch64.so.1()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5I18nLocaleData.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5UnitConversion.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKOSMIndoorMap.so.1()(64bit) \
libKPim5Itinerary.so.5()(64bit) \
libKPim5PkPass.so.5()(64bit) \
libKPublicTransport.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
prison-qt5-imports"

inherit rpm
