SUMMARY = "Test programs for ScaLAPACK (mvapich2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-mvapich2-test-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "8755af1ccb301180b18a80d8937a95c290d8a504cb0d8e1bc92f5cc822120ba52501b69c2c23d541c60fa00b4516cb8eb78d9ae6f1c02147a5ad634f85c434f3"

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
