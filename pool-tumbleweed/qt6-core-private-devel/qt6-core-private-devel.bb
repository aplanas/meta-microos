SUMMARY = "Non-ABI stable API for the Qt 6 Core library"
DESCRIPTION = "This package provides private headers of libQt6Core that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-core-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "59517973191b464b8809a9c792e41ce387af05c5a5fc743ab3ecc44fc47ad4b81aefe16df7265b46ccc278cb76c19a2f38139b881a97ed4cf316e5fda6c4d865"

RPROVIDES:${PN} += "qt6-core-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core"

inherit rpm
