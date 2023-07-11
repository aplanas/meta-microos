SUMMARY = "Development files for sirocco, a math library"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root of one \
dimensional sections of bivariate complex polynomials. \
 \
The output is a piecewise linear approximation of the path followed \
by the root, with the property that there is a tubular neighborhood, \
with square transversal section, that contains the actual path, and \
there is a three times thicker tubular neighborhood guaranted to \
contain no other root of the polynomial. This second property ensures \
that the piecewise linear approximation computed from all roots of a \
polynomial form a topologically correct deformation of the actual \
braid, since the inner tubular neighborhoods cannot intersect. \
 \
This subpackage contains the include files and library links for \
developing with the sirocco library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "sirocco-devel-2.1.0-1.9.aarch64.rpm"
RPM_HASH = "47796df48c00f8553828998deef51a7ee19fe589858baffe517ccb4a21d3742400c973846b2f269db7c92467b8fbf089d592826ebd71bd05f20cfed665f3c1af"

RPROVIDES:${PN} += "sirocco-devel"

RDEPENDS:${PN} += "libsirocco0"

inherit rpm
