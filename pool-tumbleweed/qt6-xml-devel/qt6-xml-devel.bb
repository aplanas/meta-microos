SUMMARY = "Development files for the Qt 6 XML library"
DESCRIPTION = "Development files for the Qt 6 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-xml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5b822092f3667ee13792c0a634ecd648b71ef7ab729da695523e0a2b8992b88f30fe1f1def55096dc31b7c09e7efd9c428e0aa5d0a177d238693befd75c4c55c"

RPROVIDES:${PN} += "cmake-Qt6Xml \
pkgconfig-Qt6Xml \
qt6-xml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Xml6 \
pkgconfig-Qt6Core"

inherit rpm
