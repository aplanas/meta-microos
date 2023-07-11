SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi3-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi3-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi3-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi3-hpc-examples-5.3.5-3.3.noarch.rpm"
RPM_HASH = "d897ca6b080d4473b84b41132cba77d8a6a1fdc58ad4d9c8f41ad118dae36f4e8bc9ed6bb4e7ea820094cbfcd0e8647d37f0a84dabe70a778d390f4e46b7a3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi3-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi3-hpc-examples"

inherit rpm
