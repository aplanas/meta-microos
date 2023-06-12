SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7b7db1acd72709703581b01f9e95ac07a5bc359fc66311db4fe31ad6fe9241d1d7a4c7d0fa8d455b10f148721a31c00b1e40387332cf2f11a6cdc939d5d148ee"

RPROVIDES:${PN} += "qt6-quickdialogs2-private-devel \
qt6-quickdialogs2-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickDialogs2)"

inherit rpm
