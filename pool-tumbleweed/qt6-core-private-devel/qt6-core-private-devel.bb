SUMMARY = "Non-ABI stable API for the Qt 6 Core library"
DESCRIPTION = "This package provides private headers of libQt6Core that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-core-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1a88baea7e1500236f20daca2fbf6e2127c3250ecfafa261050b6d694db83ebf96f1b55c445aae07798a17ad4f988f39d70f2bfd11767e34f2556f71656159c0"

RPROVIDES:${PN} += "qt6-core-private-devel \
qt6-core-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Core)"

inherit rpm
