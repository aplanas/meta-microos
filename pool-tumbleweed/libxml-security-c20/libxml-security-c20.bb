SUMMARY = "Apache XML security C++ library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "libxml-security-c20-2.0.4-1.9.aarch64.rpm"
RPM_HASH = "caacb4764c6c0801fdca0b44f1fecd1a986fd2e06696ae74deae5392c37619eb63bf9759af84c414194d6daa95710f59c9f8788f885dac59f32dd632122a096c"

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
