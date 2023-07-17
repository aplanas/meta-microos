SUMMARY = "Qt 5 Xml Library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Xml5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "04cf5d76f4f9955ce7ea2cde6db3a0360e009ba7ec0aafb5b26bdd2821097afad5eb7b5b1538d2fdafabe716f3b6dd962d8b41334262c06d60895e22f9022186"

RPROVIDES:${PN} += "libQt5Xml.so.5 \
libQt5Xml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
