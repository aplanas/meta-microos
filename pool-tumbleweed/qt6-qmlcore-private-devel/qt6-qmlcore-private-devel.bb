SUMMARY = "Non-ABI stable API for the Qt 6 QmlCore library"
DESCRIPTION = "This package provides private headers of libQt6QmlCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlcore-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9ec8b4553df1ad288e8718a91e97cbf56042eefe1f7bf1b39ac006074d7abb7b946192dc7e0da6eec8b3d9ce14ffd485c667b077276282ed0609c3013f09f55c"

RPROVIDES:${PN} += "qt6-qmlcore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCore"

inherit rpm
