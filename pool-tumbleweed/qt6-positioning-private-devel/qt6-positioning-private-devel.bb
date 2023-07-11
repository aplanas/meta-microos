SUMMARY = "Non-ABI stable API for the Qt 6 Positioning Library"
DESCRIPTION = "This package provides private headers of libQt6Positioning that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d543edae210745252e2565fdc13fe53d62f412fba10918201d4466eeda4ff64b4b9e3709a1eb72bd3b38dd9776a28dd9c73fae4017c4dc75eca23b3a28af4c45"

RPROVIDES:${PN} += "qt6-positioning-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Positioning"

inherit rpm
