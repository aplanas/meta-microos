SUMMARY = "Utilities for XML security C++ library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package contains the utility programs."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "xml-security-c-bin-2.0.4-1.10.aarch64.rpm"
RPM_HASH = "093c4d9010929ff4b7304a7e1f61f73d67c0b01742bfa164a89eadd6c0f1baa80a4bccc0a2b6a36d4b4dc8b2d0e18facdc552dba1bcbdd38a5f53fe3ac470222"

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
