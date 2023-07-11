SUMMARY = "Shared library for sql-parser"
DESCRIPTION = "A SQL Parser for C++. It parses the given SQL query into C++ objects. It has \
been developed for integration in Hyrise, but can be used perfectly well in \
other environments as well. \
 \
This package contains shared library for sql-parser."
LICENSE = "MIT"

PV = "1.5+git20181206"

RPM_NAME = "libsqlparser1-1.5+git20181206-2.13.aarch64.rpm"
RPM_HASH = "fe2abb795b3d22a0b2a8c777b2558a2ab5023e6b82aa7b2bb1f9f3c66a02005ffdc0b1036827a317a7d9ff73dd83e665bd9cdf6565db904492edd51ab2a952bf"

RPROVIDES:${PN} += "libsqlparser.so.1 \
libsqlparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
