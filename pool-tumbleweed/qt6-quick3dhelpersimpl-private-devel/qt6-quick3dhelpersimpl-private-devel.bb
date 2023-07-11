SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpersImpl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpersimpl-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "6283349cbf70d90893a6e923e1a1c348fa66ef3fb4f616b92385ac8872fef45cd31776fe65678f06e30eb9635efa86ac2d46295f3dfc1550d5bb9a02bc2e4409"

RPROVIDES:${PN} += "qt6-quick3dhelpersimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpersImpl"

inherit rpm
