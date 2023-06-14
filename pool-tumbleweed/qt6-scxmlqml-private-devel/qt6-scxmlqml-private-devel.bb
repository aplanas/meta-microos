SUMMARY = "Non-ABI stable API for the Qt 6 ScxmlQml library"
DESCRIPTION = "This package provides private headers of libQt6ScxmlQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxmlqml-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7bca7c7b17c6450e948f7f3c7bdc4034a12b64cd9b6e887b957c77f0d0ad02f8069c6df6705ee2b53ecabf3ecae344b22ff267e57ed6d3dc725a056f1fea5b54"

RPROVIDES:${PN} += "qt6-scxmlqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ScxmlQml"

inherit rpm
