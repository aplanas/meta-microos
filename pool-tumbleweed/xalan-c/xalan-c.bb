SUMMARY = "An XSLT Transformation Engine in C++"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath)."
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "xalan-c-1.12-1.12.aarch64.rpm"
RPM_HASH = "77e8956157007090e1e1375795b20d83efec4b443df262c531f75f3b343377c28390bfee58ab4396ba60be41f135de1c7680479ceb03c152c370be0d14e98d53"

RPROVIDES:${PN} += "Xalan-C \
xalan-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxalan-c.so.112 \
libxerces-c-3.2.so"

inherit rpm
