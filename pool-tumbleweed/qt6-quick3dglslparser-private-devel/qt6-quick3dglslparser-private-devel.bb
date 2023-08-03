SUMMARY = "Development files for the Qt 6 Quick3DGlslParser library"
DESCRIPTION = "Development files for the Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dglslparser-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "403111761c0565f57b977e6b7fb7ba7204e4fea027fcb9c25eecdf7f5731976a1f02f3c0f5bf0bd6b9d3e572e5e560fe2b9101197d3463a03fe350223d4348af"

RPROVIDES:${PN} += "cmake-Qt6Quick3DGlslParserPrivate \
qt6-quick3dglslparser-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libQt6Quick3DGlslParser6"

inherit rpm
