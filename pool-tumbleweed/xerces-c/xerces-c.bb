SUMMARY = "A Validating XML Parser"
DESCRIPTION = "Xerces-C is a validating XML parser written in a portable subset of \
C++. Xerces-C makes it easy to give your application the ability to \
read and write XML data. A shared library is provided for parsing, \
generating, manipulating, and validating XML documents. Xerces-C is \
faithful to the XML 1.0 recommendation and associated standards ( DOM \
1.0, DOM 2.0. SAX 1.0, SAX 2.0, Namespaces)."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "xerces-c-3.2.4-1.5.aarch64.rpm"
RPM_HASH = "5b8fc50300c723af4c95f4f71efd8780619a23ff7654aaa7cc09a34c32b43ee76ad534f5d8b2e0cad97fe89ec4597080bdf42028b168732fa59d6282436637cb"

RPROVIDES:${PN} += "xerces-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxerces-c-3.2.so"

inherit rpm
