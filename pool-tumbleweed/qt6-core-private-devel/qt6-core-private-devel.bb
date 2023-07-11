SUMMARY = "Non-ABI stable API for the Qt 6 Core library"
DESCRIPTION = "This package provides private headers of libQt6Core that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-core-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "7566645692d905f009218a3d119d2d41c3683f6f977a188042f7f52e79c5861ecd08f1372dc6ad82ae0a2a89ff6a04cc7711b15aec62712c89c38bda1aca13ce"

RPROVIDES:${PN} += "qt6-core-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core"

inherit rpm
