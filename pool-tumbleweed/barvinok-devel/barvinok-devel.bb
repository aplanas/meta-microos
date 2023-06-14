SUMMARY = "Development files for PolyLib"
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
developing with PolyLib."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.6"

RPM_NAME = "barvinok-devel-0.41.6-1.4.aarch64.rpm"
RPM_HASH = "87d7eec4381638f78328fa32399752a3995e49b547c04fb0499c274451a1c5c26cae015031b899d4cd6cce548c6f2b5d211b31b9e2dd3d56036a45965e368c24"

RPROVIDES:${PN} += "barvinok-devel \
pkgconfig-barvinok"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbarvinok23"

inherit rpm
