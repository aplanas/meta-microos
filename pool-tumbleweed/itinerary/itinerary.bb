SUMMARY = "Itinerary and boarding pass management application"
DESCRIPTION = "Itinerary and boarding pass management application."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "itinerary-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f748baea0f144bd408fda7976c6c5138ced5ccc2e0e9091c982496398fb04bbc675c9b3275a1005fdb3e66e06fcb2b7587b25196f6006eefda17808732b929d2"

RPROVIDES:${PN} += "itinerary \
libSolidExtras.so \
libsolidextrasqmlplugin.so \
qt5qmlimport-org.kde.solidextras.1"

RDEPENDS:${PN} += "breeze5-icons \
ki18n-imports \
kirigami2 \
kopeninghours \
kosmindoormap \
kpublictransport \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5I18nLocaleData.so.5 \
libKF5KIOGui.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5Notifications.so.5 \
libKF5UnitConversion.so.5 \
libKF5WindowSystem.so.5 \
libKOSMIndoorMap.so.1 \
libKPim5Itinerary.so.5 \
libKPim5PkPass.so.5 \
libKPublicTransport.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1 \
prison-qt5-imports"

inherit rpm
