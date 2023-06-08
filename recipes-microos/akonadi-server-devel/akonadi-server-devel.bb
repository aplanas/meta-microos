SUMMARY = "Akonadi Framework: Build Environment"
DESCRIPTION = "This package contains development files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-server-devel-23.04.0-2.1.aarch64.rpm"
RPM_HASH = "87de812eac4dbf9fe54795a4d4888988711d0e7cc5aaf76dcdc685cfd1ada9260f360fd160a2e4563263ee7fe32ce0695be7ec9583610dfac51be3a0215d8b0d"

RPROVIDES:${PN} += "akonadi-server-devel akonadi-server-devel(aarch-64) cmake(KF5Akonadi) cmake(KPim5Akonadi) libKF5AkonadiPrivate-devel"
RDEPENDS:${PN} += "akonadi-server cmake(KF5Config) cmake(KF5ConfigWidgets) cmake(KF5CoreAddons) cmake(KF5ItemModels) cmake(KF5KIO) cmake(KF5XmlGui) cmake(Qt5Core) cmake(Qt5DBus) cmake(Qt5Network) cmake(Qt5Widgets) cmake(Qt5Xml) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiAgentBase5 libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiCore5 libKPim5AkonadiWidgets.so.5()(64bit) libKPim5AkonadiWidgets5 libKPim5AkonadiXml.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
