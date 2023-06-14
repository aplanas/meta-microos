SUMMARY = "PIM Storage Service"
DESCRIPTION = "This package contains the data files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-server-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4bb37a3bcddbd0170b540d237f2a1f00a3c82e6cafb04cebef3eec807ce5d281d7ad3a588356b0d427016348433b9fa461f7b03a44d5469d8016a593b73cb153"

RPROVIDES:${PN} += "akonadi-server \
akonadi5 \
config-akonadi-server"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiAgentBase.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiPrivate.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5AkonadiXml.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqt5-sql-mysql \
libstdc++.so.6 \
mysql"

inherit rpm
