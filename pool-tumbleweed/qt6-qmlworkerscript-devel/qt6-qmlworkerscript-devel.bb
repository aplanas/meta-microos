SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlworkerscript-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "3cd72f6b1e38c75877813da766d44219cea020946e159746abd32e6b7edb489c0ebac8bc817b93d4431f9b525511b15f40d162f6c6dfc992acc6860ab2fe2eb7"

RPROVIDES:${PN} += "cmake(Qt6QmlWorkerScript) \
pkgconfig(Qt6QmlWorkerScript) \
qt6-qmlworkerscript-devel \
qt6-qmlworkerscript-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
cmake(Qt6Qml) \
libQt6QmlWorkerScript6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Qml)"

inherit rpm
