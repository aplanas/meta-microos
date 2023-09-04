SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Impl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2quickimpl-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "46862e9f851ac59085d7e463bd3d8fcd0452dfbc4e6e8ce8e08f3f928518ec88fbcf9dfbd335149cf3377021e1e90f7b4719e7eea1dcc4704f76ee47e73a4fea"

RPROVIDES:${PN} += "qt6-quickdialogs2quickimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2QuickImpl"

inherit rpm
