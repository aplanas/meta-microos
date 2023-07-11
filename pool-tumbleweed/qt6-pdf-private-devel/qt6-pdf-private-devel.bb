SUMMARY = "Non-ABI stable API for the Qt 6 Pdf library"
DESCRIPTION = "This package provides private headers of libQt6Pdf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "960aac61f5e355af9e124361f05fb1ca54d961c673b5c4ea252860a7e0188cf6656dff0f82ac4e8f40f1629f1048c6e2abef032c373b1d51de007cbfd51921d8"

RPROVIDES:${PN} += "qt6-pdf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf"

inherit rpm
