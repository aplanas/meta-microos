SUMMARY = "Shared libraries for Xerces-c - a validating XML parser"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces). \
 \
This package contains shared libraries."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "libxerces-c-3_2-3.2.4-1.5.aarch64.rpm"
RPM_HASH = "7ade10f7571b17e4564bead360ff94800d6b82b992508c6d5888260be52585c3b97f2dc0903687f206586a50fa7cd0574cdf56eba745fdc43cf5552a18fac6e3"

RPROVIDES:${PN} += "Xerces-c \
libxerces-c-3.2.so()(64bit) \
libxerces-c-3_2 \
libxerces-c-3_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
