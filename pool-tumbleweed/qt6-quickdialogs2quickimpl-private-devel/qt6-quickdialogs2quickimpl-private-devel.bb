SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2quickimpl-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "3e23ef5dc19d909c1a3b99fa14a81ac61c8c6abdbce1ec3bb814c127684d9aa8a51699b5a71186832b7466e8a72e4d099c1b679005077c64b12a738ee4260466"

RPROVIDES:${PN} += "qt6-quickdialogs2quickimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2QuickImpl"

inherit rpm
