SUMMARY = "Development files for the Apache C++ XML security library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package includes files needed for development with xml-security-c."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "libxml-security-c-devel-2.0.4-1.10.aarch64.rpm"
RPM_HASH = "c79e60eb5c1118626761ca8fee3adcdd756ba62c98194a8463753f6299af5c5b0199244f9c4ae5bdf97360832926773a05dd53218588019856643c32783a829d"

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
