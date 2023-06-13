SUMMARY = "XML Parsing Library"
DESCRIPTION = "nXML is a C library for parsing, writing and creating XML 1.0 and 1.1 files or \
streams. It supports UTF-8, UTF-16be and UTF-16le, UCS-4 (1234, 4321, 2143, \
2312)."
LICENSE = "LGPL-2.1+"

PV = "0.18.3"

RPM_NAME = "libnxml0-0.18.3-1.25.aarch64.rpm"
RPM_HASH = "fed53487984e66d6122a5d9d4fddfaa8fd7f1b59a2eb798a2d793f414eab3060858518d8fcbce2a965602d448ddc1ab6dbe95d80aceb99dda1a02467951f8e74"

RPROVIDES:${PN} += "libnxml.so.0()(64bit) \
libnxml0 \
libnxml0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcurl.so.4()(64bit)"

inherit rpm
