SUMMARY = "Development files for the Qt 6 Quick3DGlslParser library"
DESCRIPTION = "Development files for the Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dglslparser-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "6dbcfdeb8c9e9b111cd59722059fcc2c2bd2b6eb55c41759b130d53d7daef040a4752c0d137c930615cc11b7cf5b4c99b1e709300f826cbaa1d46b264859a8de"

RPROVIDES:${PN} += "cmake-Qt6Quick3DGlslParserPrivate \
qt6-quick3dglslparser-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libQt6Quick3DGlslParser6"

inherit rpm
