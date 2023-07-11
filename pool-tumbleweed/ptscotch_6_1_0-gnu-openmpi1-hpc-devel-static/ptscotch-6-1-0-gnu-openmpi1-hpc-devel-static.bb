SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi1-hpc-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "32b24c186a0dba3dfb8094a14eea17a3952943a36de99827a61674d8fea18c85e505ed3daf90907cf91d422dfcc4c7a5ac95c9201edaa0310bb411ff2470b982"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "ptscotch-6-1-0-gnu-openmpi1-hpc-devel"

inherit rpm
