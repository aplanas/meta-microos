SUMMARY = "Documentation of LEMON"
DESCRIPTION = "LEMON stands for Library for Efficient Modeling and Optimization in \
Networks.  It is a C++ template library providing efficient \
implementations of common data structures and algorithms with focus on \
combinatorial optimization tasks connected mainly with graphs and \
networks. \
 \
This package contains the documentation of LEMON in HTML format."
LICENSE = "BSL-1.0"

PV = "1.3.1"

RPM_NAME = "lemon-doc-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "01e9264724e5f51ea5c049a6bd4bb234d7bc638805ecf9fd5070915b35e6dc418e42ef4903a747e195886a7b20836188072c0f126c96702b1eafec4b2e3c2a4e"

RPROVIDES:${PN} += "lemon-doc"

RDEPENDS:${PN} += "lemon \
libemon1-3-1"

inherit rpm
