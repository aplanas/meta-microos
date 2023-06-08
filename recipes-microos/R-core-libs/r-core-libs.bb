SUMMARY = "R language libraries"
DESCRIPTION = "This package contains the files from R/lib to make their usage \
possible without installing a complete R. (I.e. VTK uses this)"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-libs-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "8c1d01cf1ee76f0a9f6b89fec2b577558a1ca829fa9b1014c966bb30718e536561b62eb98be41ba5b93055adbe82dadd6f37304550b999238fd14ab64583d469"

RPROVIDES:${PN} += "R-core-libs R-core-libs(aarch-64) config(R-core-libs) libR.so()(64bit) libRblas.so()(64bit) libRlapack.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre2-8.so.0()(64bit) libreadline.so.8()(64bit) libz.so.1()(64bit)"

inherit rpm
