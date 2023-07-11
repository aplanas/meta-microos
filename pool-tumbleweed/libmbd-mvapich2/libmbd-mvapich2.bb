SUMMARY = "Many-body dispersion library"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-mvapich2-0.12.6-1.4.aarch64.rpm"
RPM_HASH = "ab68c52c2633ff76e991be5ea1171ffc40149fe1e016e15ab7397d4b0998a1eb0391b2a7de9545f0a91e2b17d754d84cb034fa94fd1022c7279acb23b4d601f5"

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
