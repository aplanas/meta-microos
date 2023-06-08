SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi3-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi3-hpc provides the dependency to get binary package adios_1_13_1-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi3-hpc-1.13.1-5.13.noarch.rpm"
RPM_HASH = "e0f219d1404175ee468598c4beed8747182f314d1d102a52e69c88e9a87113125f805965f64dd2d1d9545df31d11f1eb7b8758bc87d7fc8bc1a6086938d7466f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi3-hpc"
RDEPENDS:${PN} += "/bin/sh adios_1_13_1-gnu-openmpi3-hpc"

inherit rpm
