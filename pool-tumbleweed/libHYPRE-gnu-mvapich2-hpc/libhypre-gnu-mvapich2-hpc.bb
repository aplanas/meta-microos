SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mvapich2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mvapich2-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "dac8db8a521fdc87bd488e39b00b63053f550c3cadc76de1fdaad38477057d451252f6172983dbc7dde98fc1f3b1eb777b3562d98cd86ab4e9eeaea2823a00c5"

RPROVIDES:${PN} += "libHYPRE-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-mvapich2-hpc"

inherit rpm
