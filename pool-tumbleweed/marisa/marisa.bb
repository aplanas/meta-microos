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

RPM_NAME = "marisa-0.2.6-1.24.aarch64.rpm"
RPM_HASH = "9d3f3c94d0af9237331c9898a6ddef9b811ba59b8fd7f1d3366c5c516e17e1e64f1b9ab9f2ac553f8e2e7be7278c33c5f4ea6a659e82984a9297abdb2cd24819"

RPROVIDES:${PN} += "marisa \
marisa-trie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmarisa.so.0 \
libstdc++.so.6"

inherit rpm
