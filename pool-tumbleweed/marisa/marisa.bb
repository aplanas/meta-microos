SUMMARY = "Matching Algorithm with Recursively Implemented StorAge"
DESCRIPTION = "Matching Algorithm with Recursively Implemented StorAge (MARISA) is a \
static and space-efficient trie data structure. And libmarisa is a C++ \
library to provide an implementation of MARISA. Also, the package of \
libmarisa contains a set of command line tools for building and \
operating a MARISA-based dictionary. \
 \
A MARISA-based dictionary supports not only lookup but also reverse \
lookup, common prefix search and predictive search."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "marisa-0.2.6-1.23.aarch64.rpm"
RPM_HASH = "532ad482912be2ab4e5bf70e0d0680ce95bdea385642fa4cc5f09bff396ef490be5dc8b899649e78985ce92520ad9570d08f1d5beec977d1b021bd8f49854ee2"

RPROVIDES:${PN} += "marisa \
marisa-trie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6"

inherit rpm
