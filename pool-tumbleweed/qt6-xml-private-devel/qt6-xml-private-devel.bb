SUMMARY = "Non-ABI stable API for the Qt 6 XML library"
DESCRIPTION = "This package provides private headers of libQt6Xml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-xml-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "a8c287d616f54854fc37265df909fad587cce62d80f88b56071f02e3186ef81df35f573c5eb00a47f5568144739187e1a530ccc3a82c18c3ddc1dc47afafc8b1"

RPROVIDES:${PN} += "qt6-xml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Xml \
qt6-core-private-devel"

inherit rpm
