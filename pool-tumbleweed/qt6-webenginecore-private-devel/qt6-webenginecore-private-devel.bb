SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineCore library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginecore-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "cfc029b499cf8dc2b49d655bcacbab711d404ded6ed687c68afbd8a0b2c66f6378d991cf7d432f5166c84d5fb8d6ef2ccb40999cfa3700811305d82db6a0ffb1"

RPROVIDES:${PN} += "qt6-webenginecore-private-devel \
qt6-webenginecore-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebEngineCore)"

inherit rpm
