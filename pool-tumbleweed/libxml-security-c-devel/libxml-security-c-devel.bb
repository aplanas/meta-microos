SUMMARY = "Development files for the Apache C++ XML security library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package includes files needed for development with xml-security-c."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "libxml-security-c-devel-2.0.4-1.9.aarch64.rpm"
RPM_HASH = "e6c0924092d2bde6c181ca610e0b4959591cf872f05868cb376f8c2fd99e031bd1afcf362613446a2313124115be7d99d88382b85fac1c7625874683b93cef13"

RPROVIDES:${PN} += "libxml-security-c-devel \
pkgconfig-xml-security-c \
xml-security-c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxalan-c-devel \
libxerces-c-devel \
libxml-security-c20 \
openssl-devel \
pkgconfig-libcrypto \
pkgconfig-xerces-c"

inherit rpm
