SUMMARY = "Telepathy contact list"
DESCRIPTION = "Telepathy contact list application"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-contact-list-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ea4bd64c8a060eeac49d88a882d3893041b8e6f718862b915db00000b0ac6515e573ce227abea64c13a5127cc51f5a50b03c5c7906c54800ebaf5ea6b9aacf8a"

RPROVIDES:${PN} += "ktp-contact-list \
ktp-contact-list5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5Notifications.so.5 \
libKF5People.so.5 \
libKF5PeopleWidgets.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKTpCommonInternals.so.9 \
libKTpLogger.so.9 \
libKTpModels.so.9 \
libKTpWidgets.so.9 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
