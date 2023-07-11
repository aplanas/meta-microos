SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-mvapich2-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-mvapich2-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "55e7e99f63a7f2bbf7d584dd178537eecf1c38939687bbf2394119e60ed2f6e20ed7ef85a73a520ad419b257b5367f5142401ab0db8eb7107f22179aec851233"

RPROVIDES:${PN} += "libptscotch-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libptscotch-6-1-0-gnu-mvapich2-hpc"

inherit rpm
