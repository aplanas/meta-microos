SUMMARY = "Shared library for sql-parser"
DESCRIPTION = "A SQL Parser for C++. It parses the given SQL query into C++ objects. It has \
been developed for integration in Hyrise, but can be used perfectly well in \
other environments as well. \
 \
This package contains shared library for sql-parser."
LICENSE = "MIT"

PV = "1.5+git20181206"

RPM_NAME = "libsqlparser1-1.5+git20181206-2.12.aarch64.rpm"
RPM_HASH = "5d0060639107aff2132d83bf78684f6d144b3ca2e553de2baabef54e52c462e26c299f5d3b8abce9e587aa600a829dc249240c6a075b570203774b7db838b2c3"

RPROVIDES:${PN} += "libsqlparser.so.1 \
libsqlparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
