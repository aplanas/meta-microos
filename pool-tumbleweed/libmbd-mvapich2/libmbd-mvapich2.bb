SUMMARY = "Many-body dispersion library"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-mvapich2-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "942c143dfcfd70a5c3e1697419fa5d55fc097b6e61cf9afba4e57b8b8b49240461b5379dc1c4a8ed0e4b84cc795681a3eb8e4bb75f0c6918a43510704f1e6aaf"

RPROVIDES:${PN} += "libmbd-mvapich2 \
libmbd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.12 \
libmpifort.so.12 \
libscalapack.so.2.1.0"

inherit rpm
