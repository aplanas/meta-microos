SUMMARY = "Snowball compiler and stemming algorithms"
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
Rust are supported."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "snowball-2.1.0-1.8.aarch64.rpm"
RPM_HASH = "f4080c316b4c8f41234b778fe1848fd9aa40e2c01a60102b1c40f8a37333168e30836b1c584ecff55ae6f8512f64193cf9ba6722b368e14fac3d72cee68cb2d7"

RPROVIDES:${PN} += "libstemmer-tools \
snowball \
snowball(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libstemmer.so.0d()(64bit)"

inherit rpm
