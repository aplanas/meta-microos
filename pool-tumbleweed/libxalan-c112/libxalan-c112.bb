SUMMARY = "An XSLT Transformation Engine in C++"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath)."
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "libxalan-c112-1.12-1.11.aarch64.rpm"
RPM_HASH = "35f5a4fd8aaf687bd42dc426fb712aa0232d694a0a0c82bd5ea7ef13d395c3b4715f4c7ee41c040aca78e2ac20f2f4c0d96c05719770ad31d2d141f472e5dbb3"

RPROVIDES:${PN} += "libXalan-c111 \
libxalan-c.so.112 \
libxalan-c112 \
libxalanMsg.so.112"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxerces-c-3.2.so"

inherit rpm
