SUMMARY = "XML Parsing Library"
DESCRIPTION = "nXML is a C library for parsing, writing and creating XML 1.0 and 1.1 files or \
streams. It supports UTF-8, UTF-16be and UTF-16le, UCS-4 (1234, 4321, 2143, \
2312)."
LICENSE = "LGPL-2.1+"

PV = "0.18.3"

RPM_NAME = "libnxml-devel-0.18.3-1.25.aarch64.rpm"
RPM_HASH = "411a8dfded3f7f26a97ff5cb1afd6cddeb16adb4d893c51f3b0c040c38aa5b07e1603a85113504b3e04307798fac841ce3481811f2b934423e0203dfe6ec6677"

RPROVIDES:${PN} += "libnxml-devel \
pkgconfig-nxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcurl-devel \
libnxml0"

inherit rpm
