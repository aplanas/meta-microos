SUMMARY = "Development files for PolyLib"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension. \
 \
It can manipulate non-parameterized unions of polyhedra \
(intersection, difference, union, convex hull, simplify, image and \
preimage, plus some input and output functions), parameterized \
vertices computation, and Ehrhart polynomials computation. \
 \
This subpackage contains the include files and library links for \
developing with PolyLib."
LICENSE = "GPL-3.0-or-later"

PV = "5.22.5"

RPM_NAME = "polylib-devel-5.22.5-1.11.aarch64.rpm"
RPM_HASH = "26a7138c2ad51fd50c04b676aefc13667373e651c9bc9455956718d0300cf470e02f730b8333a5859020109157d3337bbe18eb81a4942780994d4f3a1b99067c"

RPROVIDES:${PN} += "pkgconfig(polylibgmp) \
polylib-devel \
polylib-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolylibgmp8"

inherit rpm
