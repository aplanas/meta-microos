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

RPM_NAME = "lemon-doc-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "3a7c43335efe6727e4b90c132d95bbc17194806050fcbf020229eaf3764c0ddd55f73aa9ea38e6dc2294ecb99a90ee655da0c43faa34068a85a5ebff786acf59"

RPROVIDES:${PN} += "lemon-doc \
lemon-doc(aarch-64)"

RDEPENDS:${PN} += "lemon \
libemon1_3_1"

inherit rpm
