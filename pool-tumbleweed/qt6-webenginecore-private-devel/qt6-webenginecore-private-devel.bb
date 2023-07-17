SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineCore library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginecore-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9e794b2c906acff3f2aef401c7e08466cbc958ad8ae57f0c230a0b267e21f48878a9d936f0e9e8b59f18642dae71764c18a1a00bc58838769790e7960ec79f2c"

RPROVIDES:${PN} += "qt6-webenginecore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineCore"

inherit rpm
