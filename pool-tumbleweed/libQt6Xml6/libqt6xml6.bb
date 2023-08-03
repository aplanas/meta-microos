SUMMARY = "Qt 6 XML library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Xml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1d4f30f8d5defcd3da43f309183b95212b380d3a45b9531bafbc316a7a3dbeeb9bfc04024da32c7f4af6a43ba9a40b41680f6d06579fb0e1665ef5f0f2cbc7e2"

RPROVIDES:${PN} += "libQt6Xml.so.6 \
libQt6Xml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
