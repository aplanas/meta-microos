SUMMARY = "Utilities for XML security C++ library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package contains the utility programs."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "xml-security-c-bin-2.0.4-1.9.aarch64.rpm"
RPM_HASH = "5cffe161ce4ba229b7fac41dd9bf63405e9037bd38e18fda501c26b04515c960e7cb5c2b46df67304b24e55490a9643e01b1141a9cf602f8d6ccd590e0ab8c68"

RPROVIDES:${PN} += "xml-security-c-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxalan-c.so.112 \
libxerces-c-3.2.so \
libxml-security-c.so.20"

inherit rpm
