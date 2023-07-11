SUMMARY = "Static libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi2-hpc-devel-static-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "1eaa6cc9ebc3cee028a8900e75a70c988fbda6752d6f1eef1c6eaa68931ff147b38daa315366a3f1217b08c404751e503d25370e04dde8a331c18fa229a6da05"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-openmpi2-hpc-devel-static \
scalapack-2-1-0-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi2-hpc-devel"

inherit rpm
