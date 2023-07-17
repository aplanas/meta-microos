SUMMARY = "Development files for the Qt 6 XML library"
DESCRIPTION = "Development files for the Qt 6 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-xml-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "c3a4399292db2d73be7abf94da62ca9b7af5a681cdd5f0977b22c2b2002cf52fe9d8cc71121fed2855d5fc5c6bf9154406c5e91ba521be5b1b45f8287b7d1455"

RPROVIDES:${PN} += "cmake-Qt6Xml \
pkgconfig-Qt6Xml \
qt6-xml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Xml6 \
pkgconfig-Qt6Core"

inherit rpm
