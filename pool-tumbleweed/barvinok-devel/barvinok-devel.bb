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

PV = "0.41.7"

RPM_NAME = "barvinok-devel-0.41.7-1.1.aarch64.rpm"
RPM_HASH = "e279285e69d006132758ac3f50e06bbff74500ff0d9b15dd160f56016962e8172d017c128dc219a653ce489613238ff2ab4a006d83c6a7adb0e5d7acc81a2736"

RPROVIDES:${PN} += "barvinok-devel \
pkgconfig-barvinok"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbarvinok23 \
pkgconfig-gmp \
pkgconfig-isl"

inherit rpm
