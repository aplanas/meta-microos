SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2quickimpl-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "e1bd670ec10c232f08be06be0b2b3c11322b1a6cfe1532b4528a1625452e097fd3000facfab07f2923794d9a95705807ae55776b7bff06d94c75bf538ee17246"

RPROVIDES:${PN} += "qt6-quickdialogs2quickimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2QuickImpl"

inherit rpm
