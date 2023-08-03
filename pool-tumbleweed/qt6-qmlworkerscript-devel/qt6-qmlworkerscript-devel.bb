SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlworkerscript-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "16bf1c5a84d9516a4ec63dceeb8ae28b910c3c1e5d078a326975511e6e7285248e7912de05269f64eb0432fcb859a208f7f168b064bd838a7a117e5216b42cbe"

RPROVIDES:${PN} += "cmake-Qt6QmlWorkerScript \
pkgconfig-Qt6QmlWorkerScript \
qt6-qmlworkerscript-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6QmlWorkerScript6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
