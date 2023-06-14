SUMMARY = "Non-ABI stable API for the Qt 6 QuickTimeline Library"
DESCRIPTION = "This package provides private headers of libQt6QuickTimeline that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quicktimeline-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "38d2147b37a763cb6df26c8dfc87636b70096b97472b07bced95468520efc45861a397fb16ab8f7d2e064931d2920276e8db207173d9c6d685acc707e58cf3c6"

RPROVIDES:${PN} += "qt6-quicktimeline-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTimeline"

inherit rpm
