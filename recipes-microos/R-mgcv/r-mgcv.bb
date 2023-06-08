SUMMARY = "Package provides recommended R-mgcv"
DESCRIPTION = "This packages provides R-mgcv, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.8.42"

RPM_NAME = "R-mgcv-1.8.42-45.1.aarch64.rpm"
RPM_HASH = "9d9881c3e24dde82b991063cd7797ab65758cac2386b4aa10f1084b1318287e6bf2c6b510fe582cd1431e128cc105f9a73628d0de55ac95f8a5df268180916c2"

RPROVIDES:${PN} += "R-mgcv R-mgcv(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libRblas.so()(64bit) libRlapack.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
