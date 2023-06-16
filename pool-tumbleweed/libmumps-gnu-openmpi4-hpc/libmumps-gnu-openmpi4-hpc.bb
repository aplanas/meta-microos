SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi4-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi4-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi4-hpc-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "e95a24c4d9c0a0faae0808efb62bcb506e129b6a6fee1cae99df76de3e4a761d820a0338202a8f0f022dec006a98d425d040223236f8972d7a7ec528450b08fa"

RPROVIDES:${PN} += "libmumps-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libmumps-5-3-5-gnu-openmpi4-hpc"

inherit rpm
