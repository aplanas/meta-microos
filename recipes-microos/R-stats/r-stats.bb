SUMMARY = "Package providing R-stats"
DESCRIPTION = "This package provides R-stats, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-stats-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "d33be6a92a29868e1ad35ad8f5726bb3148c8cf4ef5a9037e1a7e2b4adbaf9f10c3ebf02febe0eb4b7ef6ee00807a0c09ebfd766292ab98d10c653080a385123"

RPROVIDES:${PN} += "R-stats R-stats(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libRblas.so()(64bit) libRlapack.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
