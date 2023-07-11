SUMMARY = "Akonadi Framework: Build Environment"
DESCRIPTION = "This package contains development files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-server-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "86c81368a095f761a1b65360724754773e1ef1eb87f25ac2fe3545d751628ef70ad8dbf8411459b3246dadb51e7a6b7ac0c65f4536f3b371b363b1fe23fa44fa"

RPROVIDES:${PN} += "akonadi-server-devel \
cmake-KF5Akonadi \
cmake-KPim5Akonadi \
libKF5AkonadiPrivate-devel"

RDEPENDS:${PN} += "akonadi-server \
cmake-KF5Config \
cmake-KF5ConfigWidgets \
cmake-KF5CoreAddons \
cmake-KF5ItemModels \
cmake-KF5KIO \
cmake-KF5XmlGui \
cmake-Qt5Core \
cmake-Qt5DBus \
cmake-Qt5Network \
cmake-Qt5Widgets \
cmake-Qt5Xml \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiAgentBase5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiCore5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5AkonadiWidgets5 \
libKPim5AkonadiXml.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
