SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginewidgets-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "44dec5b71c38b105e7fa0777b989c1ae42780224f0366920d850d2dcca8e427489f39a59513837bd8e9bc2391fdec0765170806969ad85304d9aaf22dae414ce"

RPROVIDES:${PN} += "qt6-webenginewidgets-private-devel \
qt6-webenginewidgets-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6WebEngineWidgets)"

inherit rpm
