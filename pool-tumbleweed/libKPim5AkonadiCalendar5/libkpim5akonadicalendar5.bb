SUMMARY = "KDE PIM Libraries: AkonadiCalendar"
DESCRIPTION = "This library provides calendar integration for Akonadi based Applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiCalendar5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d954d8dc33c1269c2a5979b7bf6cd67633c3703c7c6fd65f14f9a478da2c1ede52d9fe78805eab81560b069912e63e87f94a325039d93d47b7a09058a6b2a1f0"

RPROVIDES:${PN} += "libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiCalendar5 \
libKPim5AkonadiCalendar5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5MailTransportAkonadi.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
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
libstdc++.so.6()(64bit)"

inherit rpm
