SUMMARY = "Non-ABI stable API for the Qt 6 Pdf library"
DESCRIPTION = "This package provides private headers of libQt6Pdf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdf-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "fe79897ef711e4c9f92873a34290a6ba32541b1522c6620f3b25d8087cd80a00673c588cabdc1cf1d00f0f89473fb6a903e0fa5972f45c25a6333993df66c080"

RPROVIDES:${PN} += "qt6-pdf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf"

inherit rpm
