SUMMARY = "Test programs for ScaLAPACK (mvapich2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-mvapich2-test-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "1f17678f49c44e8cdc4b6f19b643816efe8404e0eb5b24f1175b72f90ca9bb5994c5be30f05d49596b7df85db6f3cd934912a5b68e7dd2ab686c5d154240fd91"

RPROVIDES:${PN} += "scalapack-mvapich2-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.12 \
libmpifort.so.12"

inherit rpm
