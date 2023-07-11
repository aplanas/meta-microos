SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-doc-3.5-3.4.aarch64.rpm"
RPM_HASH = "5d77e241618df1be607705cf48993dac3e04877901f528c2129f21311d2833269b666d3d2148b50dd75c1339edf67649b0cd7acb922abdee17d579d963643e83"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
