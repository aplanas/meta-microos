SUMMARY = "Header files for permlib, a permutation computation library"
DESCRIPTION = "PermLib is a C++ library for permutation computations. It is \
implemented in C++ header files only. \
 \
Currently, it supports set stabilizer and in-orbit computations, \
based on bases and strong generating sets (BSGS). Additionally, it \
computes automorphisms of symmetric matrices and find the \
lexicographically smallest set in an orbit of sets. It also features \
a very basic recognition of permutation group types."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "permlib-devel-0.2.9-1.10.noarch.rpm"
RPM_HASH = "5b7a2515d18ec1688da48230a25ddd895939f59ea626bf4d50cbff61407344b631f52514d6256dbca9d59454aa59c8e2119492aee0ba810cc99efc5c01a89d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "permlib-devel"

RDEPENDS:${PN} += "libboost-headers-devel"

inherit rpm
