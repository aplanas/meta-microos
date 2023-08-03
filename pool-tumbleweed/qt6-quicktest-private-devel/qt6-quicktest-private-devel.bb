SUMMARY = "Non-ABI stable API for the Qt 6 QuickTest library"
DESCRIPTION = "This package provides private headers of libQt6QuickTest that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quicktest-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4da25769f931feff11c4e54a43a4bc2bf931e36af1c2b0af7bf2da63a7307e72fbc154661d97366690750c578e5f7a41fba3313ac1a2dd4baea41879705a6dfa"

RPROVIDES:${PN} += "qt6-quicktest-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTest \
qt6-test-private-devel"

inherit rpm
