SUMMARY = "Telepathy contact list"
DESCRIPTION = "Telepathy contact list application"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-contact-list-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "7974d8f595a8462fe9ed7bf1c04d60eaebf3b1cc170bc832531eed1761fe44b78f768d4c50b3e5898361c457027770de50e369566ba362c1a4c11db10674e8f3"

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
