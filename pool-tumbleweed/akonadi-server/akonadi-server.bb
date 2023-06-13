SUMMARY = "PIM Storage Service"
DESCRIPTION = "This package contains the data files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-server-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4bb37a3bcddbd0170b540d237f2a1f00a3c82e6cafb04cebef3eec807ce5d281d7ad3a588356b0d427016348433b9fa461f7b03a44d5469d8016a593b73cb153"

RPROVIDES:${PN} += "akonadi-server \
akonadi-server(aarch-64) \
akonadi5 \
config(akonadi-server)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKPim5AkonadiAgentBase.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiPrivate.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5AkonadiXml.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libaccounts-qt5.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libqt5-sql-mysql \
libstdc++.so.6()(64bit) \
mysql"

inherit rpm
