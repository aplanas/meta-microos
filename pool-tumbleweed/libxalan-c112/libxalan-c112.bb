SUMMARY = "An XSLT Transformation Engine in C++"
DESCRIPTION = "Xalan is an XSL processor for transforming XML documents into HTML, \
text, or other XML document types. Xalan-C++ represents an almost \
complete and robust C++ reference implementation of the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath)."
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "libxalan-c112-1.12-1.12.aarch64.rpm"
RPM_HASH = "bf032b931926ab9bfbec14da0ab5d0ea4117f058797be0a95e42f6173e8da8d6651e1e5b7690c85c258ef9a0f3ea04ef30647d9a962e031b223ca398b7f57f5b"

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
