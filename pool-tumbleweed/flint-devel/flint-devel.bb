SUMMARY = "Development files for flint"
DESCRIPTION = "FLINT (Fast Library for Number Theory) is a C library in support of \
computations in number theory. It is also a research project into \
algorithms in number theory. At this stage, FLINT consists mainly of \
fast integer and polynomial arithmetic and linear algebra. \
 \
This subpackage contains the include files and library links for \
developing against the FLINT library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.9.0"

RPM_NAME = "flint-devel-2.9.0-2.1.aarch64.rpm"
RPM_HASH = "62cdd195f80eb23e1bae47c2d88c7d91d6fd4b425b7ea3c6fb7903e3694819c308f441f2169c2214b07ba1573d29d2185f4b534aac94dfe6d337c08b98d37866"

RPROVIDES:${PN} += "flint-devel"

RDEPENDS:${PN} += "gmp-devel \
libflint17 \
mpfr-devel \
ntl-devel"

inherit rpm
