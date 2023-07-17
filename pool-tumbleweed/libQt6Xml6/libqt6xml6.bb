SUMMARY = "Qt 6 XML library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Xml6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "8236d6cc2d18a633203763cf93a3b2f704b270110e0baed4d9672673698a75e7897e01f7d4f378aa7b3920d2448b428729741e68906fab2593162d8906fd7ac6"

RPROVIDES:${PN} += "libQt6Xml.so.6 \
libQt6Xml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
