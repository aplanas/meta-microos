SUMMARY = "PIM Storage Service"
DESCRIPTION = "This package contains the data files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-server-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7c92b5d8fa088711f0d1e5e864a80c6ee15e473cf888a862fdbeb31a4779a5937c9dcf076d45b4091ed35649fda04aa925aaa3a54dde998d4c6380119aa93efd"

RPROVIDES:${PN} += "akonadi-server \
akonadi-server-sqlite \
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
