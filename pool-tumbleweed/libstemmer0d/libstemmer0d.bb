SUMMARY = "Shared library for libstemmer"
DESCRIPTION = "Snowball is a small string processing language for creating stemming algorithms \
for use in Information Retrieval, plus a collection of stemming algorithms \
implemented using it. \
 \
Snowball was originally designed and built by Martin Porter. Martin retired \
from development in 2014 and Snowball is now maintained as a community project. \
Martin originally chose the name Snowball as a tribute to SNOBOL, the excellent \
string handling language from the 1960s. It now also serves as a metaphor for \
how the project grows by gathering contributions over time. \
 \
The Snowball compiler translates a Snowball program into source code in another \
language - currently ISO C, C#, Go, Java, Javascript, Object Pascal, Python and \
Rust are supported. \
 \
This package holds the shared library for libstemmer."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "libstemmer0d-2.1.0-1.8.aarch64.rpm"
RPM_HASH = "1c92478f031c10c91b41eb771e31e4ea4427311fd597c594ccf62260f993f476b984f7b6e3e4e136aaf2e10cda6b6dc76d56c497deb65f51cf2625e46e94aebc"

RPROVIDES:${PN} += "libstemmer.so.0d()(64bit) \
libstemmer0d \
libstemmer0d(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
