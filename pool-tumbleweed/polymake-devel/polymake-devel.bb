SUMMARY = "Development files for the polymake library"
DESCRIPTION = "polymake is a tool to study the combinatorics and the geometry of \
convex polytopes and polyhedra. It is also capable of dealing with \
simplicial complexes, matroids, polyhedral fans, graphs, tropical \
objects, and other objects."
LICENSE = "GPL-2.0-or-later"

PV = "4.10"

RPM_NAME = "polymake-devel-4.10-1.1.aarch64.rpm"
RPM_HASH = "fe37958be3eef6354c8e111a34a7eb516dcfb8337bdaddccc8f97f36ba813a9e040b199746b1d01603df3c583db714143b72502536c776187ecc2d4ee17cdb36"

RPROVIDES:${PN} += "polymake-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
libpolymake4-10"

inherit rpm
