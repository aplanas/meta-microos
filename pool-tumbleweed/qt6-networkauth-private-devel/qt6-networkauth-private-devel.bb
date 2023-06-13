SUMMARY = "Non-ABI stable API for the Qt 6 NetworkAuth Library"
DESCRIPTION = "This package provides private headers of libQt6NetworkAuth that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-networkauth-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "be3d3f21e2e0b5dfd079b0714e7b3a4c3bebfede829f519868232547c75be18bb7e7b93ad65b65f3b641af7e7f217f11e91ec91f0cd2f74628efa3d20e3fbbf1"

RPROVIDES:${PN} += "qt6-networkauth-private-devel \
qt6-networkauth-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6NetworkAuth)"

inherit rpm
