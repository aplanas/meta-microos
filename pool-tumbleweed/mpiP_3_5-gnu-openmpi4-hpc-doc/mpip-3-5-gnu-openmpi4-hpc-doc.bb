SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-doc-3.5-3.3.aarch64.rpm"
RPM_HASH = "aa2732df030ba190608eaea9e99145b0b1ca6f10803f0999bf16993f25575e69b2cd141951ac1264c2a7c4b6e01cdf7f230d05220c5540f558039c11e309a474"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
