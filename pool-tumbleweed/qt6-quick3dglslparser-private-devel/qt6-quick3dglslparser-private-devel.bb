SUMMARY = "Development files for the Qt 6 Quick3DGlslParser library"
DESCRIPTION = "Development files for the Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dglslparser-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c4bcc63318a61654a53b1d8f99a03055acbf64b322440067d647ddae8f9fe6b1157a9b0c51101dfaa0365fce13b135e16c11f3bccfef4ea515e976bcd64a706c"

RPROVIDES:${PN} += "cmake-Qt6Quick3DGlslParserPrivate \
qt6-quick3dglslparser-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libQt6Quick3DGlslParser6"

inherit rpm
