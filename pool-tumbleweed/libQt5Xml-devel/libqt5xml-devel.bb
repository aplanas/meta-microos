SUMMARY = "Development files for the Qt5 XML library"
DESCRIPTION = "Development files for the Qt5 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Xml-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "e51a242f2a74e31cc7c79d7b468ebf172f49450a17b7b96954e1e1fe014528db3af26954bedda3af72bea51e96aeed120e77bb13879ceacff698863e85a34e23"

RPROVIDES:${PN} += "cmake-Qt5Xml \
libQt5Xml-devel \
pkgconfig-Qt5Xml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Xml5 \
pkgconfig-Qt5Core"

inherit rpm
