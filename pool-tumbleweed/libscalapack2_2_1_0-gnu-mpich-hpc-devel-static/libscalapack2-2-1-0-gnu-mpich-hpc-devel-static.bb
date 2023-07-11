SUMMARY = "Static libraries for ScaLAPACK (mpich)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mpich-hpc-devel-static-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "9eea12845005208af14b460ff57e3be53fc0225602ad469e771745b454cdbf4539dc013d8254de84eb97c3b6a7fbb9c2361d7c7d35d76a45dc0fba5b9c21e6b2"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-mpich-hpc-devel-static \
scalapack-2-1-0-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-mpich-hpc-devel"

inherit rpm
