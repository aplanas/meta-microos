SUMMARY = "Non-ABI stable API for the Qt 6 Pdf library"
DESCRIPTION = "This package provides private headers of libQt6Pdf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "759fe730dde1061953c88f6a0c2cc8c7d6907c0dad5f0f79f3d5c386c02f79205cc0c836973613fef249b3baae175eaa9efeade6e42acaf8a5aa5134b7747a6e"

RPROVIDES:${PN} += "qt6-pdf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf"

inherit rpm
