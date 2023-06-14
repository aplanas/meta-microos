SUMMARY = "RSS Parsing Library"
DESCRIPTION = "libmRSS is a C library for parsing, writing, and creating RSS (Rich Site \
Summary, Really Simple Syndication, and RDF Site Summary) and ATOM files or \
streams. The formats supported are: RSS 0.91, RSS 0.92, RSS 1.0, RSS 2.0, ATOM \
0.3, and ATOM 1.0."
LICENSE = "LGPL-2.1-only"

PV = "0.19.3"

RPM_NAME = "libmrss0-0.19.3-1.2.aarch64.rpm"
RPM_HASH = "11c016123afa0248f4e9acec2c53ca7fbda34114ffd7289e82d2c69c0d7a4e6c98fedef7929457e15a3afd445c92fa514cbefba882c563db4d39674b9c96f12b"

RPROVIDES:${PN} += "libmrss.so.0 \
libmrss0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libnxml.so.0"

inherit rpm
