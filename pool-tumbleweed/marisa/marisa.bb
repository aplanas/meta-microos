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

RPM_NAME = "marisa-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "52c8b53ad12b72ea0cfe6317a954665b9a26905acea5e63e497b79428ab6d1e7e497533e0e54e4c06e5232abf42e13ccd1f0b7572cd74f41cdd648e91414ca8f"

RPROVIDES:${PN} += "marisa \
marisa(aarch-64) \
marisa-trie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmarisa.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
