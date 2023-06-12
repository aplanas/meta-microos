SUMMARY = "Package provides recommended R-mgcv"
DESCRIPTION = "This packages provides R-mgcv, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.8.42"

RPM_NAME = "R-mgcv-1.8.42-45.2.aarch64.rpm"
RPM_HASH = "45ce5c1cd4976629df9a687be08bfb356b0c2d0096db3539d586b3a9bd9fc3d330151f1b077988d379d7701ca46423bb8bc69030c365140857d6f0edabde11be"

RPROVIDES:${PN} += "R-mgcv R-mgcv(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libRblas.so()(64bit) libRlapack.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
