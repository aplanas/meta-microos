SUMMARY = "Development files for the Qt 6 XML library"
DESCRIPTION = "Development files for the Qt 6 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-xml-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2f04d4a56e036f1c641f72273579ed0b3566007b0db55039336d1b6a6e43c73d3a3eea160f314d2358c9bf1a3a68c099d0e1fa57785c5c55846192ed06b46ad0"

RPROVIDES:${PN} += "cmake-Qt6Xml \
pkgconfig-Qt6Xml \
qt6-xml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Xml6 \
pkgconfig-Qt6Core"

inherit rpm
