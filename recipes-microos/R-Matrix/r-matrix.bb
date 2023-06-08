SUMMARY = "Package provides recommended R-Matrix"
DESCRIPTION = "This packages provides R-Matrix, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.5.4"

RPM_NAME = "R-Matrix-1.5.4-45.1.aarch64.rpm"
RPM_HASH = "b185c20f4a6e1cbebcf01b00d4983e26b2a2a251d484d3fea00911fdeaaced8f6c80cee34feb894f7b6df9f5e3950be1f5a9fc2ee7da9479d365db3d34b1512a"

RPROVIDES:${PN} += "R-Matrix R-Matrix(aarch-64) R-Matrix-devel"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libRblas.so()(64bit) libRlapack.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
