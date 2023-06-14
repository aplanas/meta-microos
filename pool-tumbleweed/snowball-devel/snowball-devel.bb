SUMMARY = "Development files libstemmer"
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
This package holds the development files for libstemmer."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "snowball-devel-2.1.0-1.8.aarch64.rpm"
RPM_HASH = "a142778cbbe5dce1bec13d35391f341b1f14b7669c9f6ee810d1376c05dcf4301089ddb142d37ca41e7dabc3ed37bb7288ce2201850c9d6fb518f8d1c2d47fcb"

RPROVIDES:${PN} += "libstemmer-devel \
snowball-devel"

RDEPENDS:${PN} += "libstemmer0d"

inherit rpm
