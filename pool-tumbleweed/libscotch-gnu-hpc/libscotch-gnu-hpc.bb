SUMMARY = "Dependency package for libscotch_6_1_0-gnu-hpc"
DESCRIPTION = "scotch: Graph, mesh and hypergraph partitioning library \
The package libscotch-gnu-hpc provides the dependency to get binary package libscotch_6_1_0-gnu-hpc. \
When this package gets updated it installs the latest version of scotch_6_1_0-gnu-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libscotch-gnu-hpc-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "09fa3f2519a2e3a8f36883608d101efd04889af8206f1e07fdcdda420b63cada2353673fe6626472f76b7b4e5040fb4bff10b4c9d2f0221a1223822a238a5afe"

RPROVIDES:${PN} += "libscotch-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
libscotch-6-1-0-gnu-hpc"

inherit rpm
