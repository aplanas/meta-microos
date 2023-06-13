SUMMARY = "Telepathy contact list"
DESCRIPTION = "Telepathy contact list application"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-contact-list-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ea4bd64c8a060eeac49d88a882d3893041b8e6f718862b915db00000b0ac6515e573ce227abea64c13a5127cc51f5a50b03c5c7906c54800ebaf5ea6b9aacf8a"

RPROVIDES:${PN} += "application() \
application(org.kde.ktpcontactlist.desktop) \
ktp-contact-list \
ktp-contact-list(aarch-64) \
ktp-contact-list5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5People.so.5()(64bit) \
libKF5PeopleWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKTpCommonInternals.so.9()(64bit) \
libKTpLogger.so.9()(64bit) \
libKTpModels.so.9()(64bit) \
libKTpWidgets.so.9()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtelepathy-qt5.so.0()(64bit)"

inherit rpm
