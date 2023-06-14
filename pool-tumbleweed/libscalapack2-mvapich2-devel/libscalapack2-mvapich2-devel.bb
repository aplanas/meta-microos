SUMMARY = "Development libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-mvapich2-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "41edae8567d380d437f1cc71ff2e1f14a56f07123db0aea5c0f193a517521922a7920f86c846e6f467fda1078ea6c516bbd0b47ccdb885e7083a82954442c60b"

RPROVIDES:${PN} += "libscalapack.so.2.1.0 \
libscalapack2-mvapich2-devel \
scalapack-mvapich2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmpi.so.12 \
libscalapack2-mvapich2 \
mvapich2-devel"

inherit rpm
