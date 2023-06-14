SUMMARY = "Development files for the polymake library"
DESCRIPTION = "polymake is a tool to study the combinatorics and the geometry of \
convex polytopes and polyhedra. It is also capable of dealing with \
simplicial complexes, matroids, polyhedral fans, graphs, tropical \
objects, and other objects."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "polymake-devel-4.9-1.3.aarch64.rpm"
RPM_HASH = "0df95e5b6b620b9d6bbc74cfcad881aac4a07e82de5a9bf58e54f26554d01174cc8f46f193f92477c2b97a4b6b6760419b874a70e6585a46af9142ead3a7b370"

RPROVIDES:${PN} += "polymake-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
libpolymake4-9"

inherit rpm
