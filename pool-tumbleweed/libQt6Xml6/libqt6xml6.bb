SUMMARY = "Qt 6 XML library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Xml6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "21467f1f137e92253831372dd8685bedfa3698db319eebb62cd6bc7c027986873574184795e0e224ca94fb0ac515b6bb899999cfab3998abaaf8cbf5d1ee902c"

RPROVIDES:${PN} += "libQt6Xml.so.6 \
libQt6Xml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
