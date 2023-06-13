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

RPROVIDES:${PN} += "xml-security-c-bin \
xml-security-c-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxalan-c.so.112()(64bit) \
libxerces-c-3.2.so()(64bit) \
libxml-security-c.so.20()(64bit)"

inherit rpm
