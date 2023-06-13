SUMMARY = "Many-body dispersion library"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-mvapich2-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "942c143dfcfd70a5c3e1697419fa5d55fc097b6e61cf9afba4e57b8b8b49240461b5379dc1c4a8ed0e4b84cc795681a3eb8e4bb75f0c6918a43510704f1e6aaf"

RPROVIDES:${PN} += "libmbd-mvapich2 \
libmbd-mvapich2(aarch-64) \
libmbd.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libmpifort.so.12()(64bit) \
libscalapack.so.2.1.0()(64bit)"

inherit rpm
