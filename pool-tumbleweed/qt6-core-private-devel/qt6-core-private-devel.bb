SUMMARY = "Non-ABI stable API for the Qt 6 Core library"
DESCRIPTION = "This package provides private headers of libQt6Core that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-core-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6e362609d119d99dbcf9bb2ce5833d4eb50387d2d19a26c110ae98e16072e2ee002147a5cbcc938a53600a51dd8614c4f022a240892c5198403db2776ba0348a"

RPROVIDES:${PN} += "qt6-core-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core"

inherit rpm
