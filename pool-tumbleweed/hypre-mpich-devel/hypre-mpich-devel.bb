SUMMARY = "Headers and library links for libHYPRE2_20_0-mpich"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mpich version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-mpich-devel-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "c72f4c98502dd0eac3cf00809da3438de19e9d53c836391aeb03f2a00d1b81813bfb01b6568811c4113b7594171c611cde5b5e550cb76cacb897734f67b6792c"

RPROVIDES:${PN} += "hypre-mpich-devel \
hypre-mpich-devel(aarch-64)"
RDEPENDS:${PN} += "lapack-devel \
libHYPRE2_20_0-mpich \
superlu-devel"

inherit rpm
