SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi3-hpc provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi3-hpc-6.1.0-2.7.noarch.rpm"
RPM_HASH = "52b81dfdeb9801f86392b6d61dedee1397560cb8c50c25c9e5194010795251495cd0958fc17b55918a0ae12af4760de3facb37f858e4b41d7e55efe89b68c661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/bin/sh \
ptscotch-6-1-0-gnu-openmpi3-hpc"

inherit rpm
