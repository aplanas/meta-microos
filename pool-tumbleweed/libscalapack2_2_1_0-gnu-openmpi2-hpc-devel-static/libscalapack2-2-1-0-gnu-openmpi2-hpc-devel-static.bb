SUMMARY = "Static libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi2-hpc-devel-static-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "d209f8012004462e39792498ebc24a4cdd111ecef70ee6cabaff99d5eb97c0f48ad98aa85c97f72202f9358adc28c0fbe98702bb4736b321581c34c3221644ff"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-openmpi2-hpc-devel-static \
scalapack-2-1-0-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi2-hpc-devel"

inherit rpm
