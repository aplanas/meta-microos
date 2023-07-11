SUMMARY = "Static libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mvapich2-hpc-devel-static-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "5933d7ce9eafe02bbac99554e88559249ecc51c9c4f9ee89e9e02ce9807c14743540a3c265671c62386e535e754c18dcb0705ac95b24dfcc480835d05839c67d"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-mvapich2-hpc-devel-static \
scalapack-2-1-0-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-mvapich2-hpc-devel"

inherit rpm
