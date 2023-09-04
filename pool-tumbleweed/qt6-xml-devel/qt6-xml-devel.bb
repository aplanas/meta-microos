SUMMARY = "Development files for the Qt 6 XML library"
DESCRIPTION = "Development files for the Qt 6 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-xml-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "6fdaaa54f1daf4bd7fa58ae8aa9175ff525f80b0b061a09b97696f3316d896f15b66059e434a9cc55107dfbbdc43a7525d4348b0159d36398418b2f013c96c9f"

RPROVIDES:${PN} += "cmake-Qt6Xml \
pkgconfig-Qt6Xml \
qt6-xml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Xml6 \
pkgconfig-Qt6Core"

inherit rpm
