SUMMARY = "Dependency package for ptscotch_6_1_0-gnu-openmpi1-hpc-devel"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package ptscotch-gnu-openmpi1-hpc-devel provides the dependency to get binary package ptscotch_6_1_0-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-gnu-openmpi1-hpc-devel-6.1.0-2.9.noarch.rpm"
RPM_HASH = "6370a4a8414ea5e4a466e5e4bdda36dc31027bacdaf13575a72f32b8a8c30e42a58676e18c9233259d3369afea7b226e5213c285d55fabfa2a22a23b54a03804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ptscotch-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ptscotch-6-1-0-gnu-openmpi1-hpc-devel"

inherit rpm
