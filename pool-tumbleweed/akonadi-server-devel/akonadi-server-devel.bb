SUMMARY = "Akonadi Framework: Build Environment"
DESCRIPTION = "This package contains development files of Akonadi, the KDE PIM storage \
service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-server-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "02c756a31751eb8e432e9c9b95291415755763880102b9d80d2a69bd0416bfbcaf567cff0239e6a29d6cbf475673239999d54d78aeaa7c73f342c5ad5a208911"

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
