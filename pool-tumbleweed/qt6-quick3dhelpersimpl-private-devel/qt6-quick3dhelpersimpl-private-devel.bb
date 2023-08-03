SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpersImpl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dhelpersimpl-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "38eb78b48472f280734ac11832a8d49a3b42498b2437336076cadaebf1ddd595834eec2eca50d46c45d8f3c5ffcec13c7fe2504433dbc5a5a6a79dfe9de66da9"

RPROVIDES:${PN} += "qt6-quick3dhelpersimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpersImpl"

inherit rpm
