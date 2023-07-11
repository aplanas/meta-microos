SUMMARY = "PIM Storage Service"
DESCRIPTION = "This package contains the data files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-server-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "dc2a2b023537afebc8610545b63c39e6b1733af44bd6e8c11f1a356a45e47deeb6f67535573cac3844c45c6d8070c8f990691caec6b94b767fd756bf732cfcb1"

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
