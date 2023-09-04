SUMMARY = "Non-ABI stable API for the Qt 6 QmlModels library"
DESCRIPTION = "This package provides private headers of libQt6QmlModels that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlmodels-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "9e2f5f5de8e671d36ccd5bb0a5f1c47f2eec741d2f93b6ff62ded2597302c4beac28acf5a9a937422f061277a8d6dd76c24c7a05810b1c551c8fcbb21c542dcb"

RPROVIDES:${PN} += "qt6-qmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlModels \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
