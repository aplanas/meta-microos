SUMMARY = "Development files for the Qt5 XML library"
DESCRIPTION = "Development files for the Qt5 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Xml-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "35b4e456b0f6c41f879376c57dd3c4100040a9f3fe8fb9a723681e3522b88ffe6d2817e4fd2d9e0d1504acc80e28302676f0e3945f7e228653ceda407add9ada"

RPROVIDES:${PN} += "cmake-Qt5Xml \
libQt5Xml-devel \
pkgconfig-Qt5Xml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Xml5 \
pkgconfig-Qt5Core"

inherit rpm
