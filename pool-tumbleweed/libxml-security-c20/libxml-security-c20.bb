SUMMARY = "Apache XML security C++ library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "libxml-security-c20-2.0.4-1.10.aarch64.rpm"
RPM_HASH = "ba564509209df701f7119677b99b2b86b7af112f2115352009edf9eb903ff2262348daed8833855e9aaa2b6bf85c78ab83ce1d89a4e9a4de77703cc6b4df633c"

RPROVIDES:${PN} += "libxml-security-c.so.20 \
libxml-security-c20 \
xml-security-c"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxalan-c.so.112 \
libxerces-c-3.2.so"

inherit rpm
