SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineCore library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginecore-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "647c8cabca2369d09fd568a74a8cec747546f620c398e1f1f1c2bf60ee63cf075dea2b79f81bd0c84b5827cd0e4356595061085b8bde11e7408d4f9af6c5085e"

RPROVIDES:${PN} += "qt6-webenginecore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineCore"

inherit rpm
