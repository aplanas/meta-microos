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

RPM_NAME = "flint-devel-2.9.0-2.2.aarch64.rpm"
RPM_HASH = "eae15be547d98a45de685465a25902484fea47a6020ba8f285bcbf5e4d08ae254545289747a8fa12dba43e55d16d10c59ecf66cbcad0899e4323af1f4cf5c548"

RPROVIDES:${PN} += "flint-devel"

RDEPENDS:${PN} += "gmp-devel \
libflint17 \
mpfr-devel \
ntl-devel"

inherit rpm
