SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "1e3576770e1ec8e372bc98a494f29bb86de5b787f36fcd7989d2a08c126d52d41473637ad206a28ecc2a2de293423ca88387a665abd823c08d33c52567d9f7ef"

RPROVIDES:${PN} += "qt6-quickdialogs2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2"

inherit rpm
