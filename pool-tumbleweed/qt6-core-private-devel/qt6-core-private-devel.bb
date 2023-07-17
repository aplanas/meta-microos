SUMMARY = "Non-ABI stable API for the Qt 6 Core library"
DESCRIPTION = "This package provides private headers of libQt6Core that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-core-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "0510477377ec8b03d9805c6127543017f4854c31ee37136a35654324eec9fe00708d0ae9eb0127c83ba1f9061318ca5b2f76cbd3353d39e402d1579187f9dc22"

RPROVIDES:${PN} += "qt6-core-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core"

inherit rpm
