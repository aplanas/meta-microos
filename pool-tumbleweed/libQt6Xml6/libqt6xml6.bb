SUMMARY = "Qt 6 XML library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Xml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1f7e21cccc746e656bdf9a564b5fcd712c3f15eaefc3892eb0fdcd5b765fdbad0a3ee1cc08311aaf4f98251895c07e445be532ff72d91b9f1133a479e3bcee15"

RPROVIDES:${PN} += "libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libQt6Xml6 \
libQt6Xml6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core6 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
