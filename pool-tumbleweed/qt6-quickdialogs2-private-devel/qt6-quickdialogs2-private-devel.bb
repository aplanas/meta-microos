SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5ab140f786be6b0f7029d9544d799f104071eed4729d6ab8e70561a1541f3381991bb665e6e4958e8b4c50e7268d09de91a1d2fad4d4620ef1b5c29cb8bb9956"

RPROVIDES:${PN} += "qt6-quickdialogs2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2 \
qt6-qmlmodels-private-devel"

inherit rpm
