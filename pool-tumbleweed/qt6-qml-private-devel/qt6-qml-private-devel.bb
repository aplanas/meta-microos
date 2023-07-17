SUMMARY = "Non-ABI stable API for the Qt 6 Qml library"
DESCRIPTION = "This package provides private headers of libQt6Qml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qml-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c440e845948cd86e696ed0a38427f59c9f748e860ea70bbce6f084e6873f89adaf7c3114ae2ae696a368d762db3e746ece35ec444e3669a0ef0eb8cef5226c28"

RPROVIDES:${PN} += "qt6-qml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
qt6-core-private-devel"

inherit rpm
