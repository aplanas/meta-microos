SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-openmpi3-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-openmpi3-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "7ee51671bd28b9387a317b347cdf4fe7d8d856725b3e80af85780f0b3a32242ad3325d972c06995d4fee1de1bd2fb36013760b194a41de44db1108fa07cd7fb7"

RPROVIDES:${PN} += "libptscotch-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libptscotch-6-1-0-gnu-openmpi3-hpc"

inherit rpm
