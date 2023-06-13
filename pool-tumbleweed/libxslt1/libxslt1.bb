SUMMARY = "XSL Transformation Library"
DESCRIPTION = "This C library allows you to transform XML files into other XML files \
(or HTML, text, and more) using the standard XSLT stylesheet \
transformation mechanism. \
 \
It is based on libxml (version 2) for XML parsing, tree manipulation, \
and XPath support. It is written in plain C, making as few assumptions \
as possible and sticks closely to ANSI C/POSIX for easy embedding. \
It includes support for the EXSLT set of extension functions as well \
as some common extensions present in other XSLT engines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.38"

RPM_NAME = "libxslt1-1.1.38-1.1.aarch64.rpm"
RPM_HASH = "2dc91838ef4ad8c8e74ba258576a724ae974d8a16146f432c35418bde2476b4070fc23161f62374ebb1af84debe53b4ff3e3ef93b4b1421f161daa83d29b4589"

RPROVIDES:${PN} += "libxslt.so.1()(64bit) \
libxslt1 \
libxslt1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
