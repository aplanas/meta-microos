SUMMARY = "Non-ABI stable API for the Qt 6 connectivity libraries"
DESCRIPTION = "This package provides private headers of qt6-connectivity that are normally \
not used by application development and that do not have any ABI or \
API guarantees. \
The packages that build against these have to require the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c5f133675cc14b60b6f3317be117b76f9ab1f5711029147aa2325f6feeb73ff666c6e381886fe99b4e732f1fccae07d8eb96b401df6b60b5ffba074af34ea6b2"

RPROVIDES:${PN} += "qt6-connectivity-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Bluetooth \
cmake-Qt6Nfc \
qt6-core-private-devel"

inherit rpm
