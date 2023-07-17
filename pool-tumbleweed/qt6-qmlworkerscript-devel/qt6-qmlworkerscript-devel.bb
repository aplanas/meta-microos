SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlworkerscript-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "2245912615beb2a03e479464ae5054b11797d5fd1ae1f1e54b20f7d4d73fa3db6123995235af1d667ed5b2b222fb8884629fe50c7611922ade5ed6699d1ef255"

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
