SUMMARY = "Qt 6 XML library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Xml6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "a13d7d821aaab07260dab9765cf87cb119f28a5f4ac3f2fe6e997a6d96c382b2f1445179570030c58fe054fbc161efbaab9e1949ae29d064ce310fce4cec216a"

RPROVIDES:${PN} += "libQt6Xml.so.6 \
libQt6Xml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
