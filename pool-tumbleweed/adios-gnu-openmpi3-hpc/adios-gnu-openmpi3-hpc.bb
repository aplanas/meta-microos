SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi3-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi3-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi3-hpc-1.13.1-5.14.noarch.rpm"
RPM_HASH = "62805d0ef7a5526b9b5c23ff98f4391cf6ddb9a8c67a1f7e034a40aedb5de96f10ab8c5e23f53d4585c4ace5e9e78795ef1c47ad6c9d4be3e3a2c730731796f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi3-hpc"

inherit rpm
