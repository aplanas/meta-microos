SUMMARY = "Dependency package for adios_1_13_1-gnu-mpich-hpc-devel-static"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mpich-hpc-devel-static provides the dependency to get binary package adios_1_13_1-gnu-mpich-hpc-devel-static. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mpich-hpc-devel-static-1.13.1-5.14.noarch.rpm"
RPM_HASH = "d8c3bf27cc4dccbae5b1aa7fc386d6c99251f68de97464d42d33f7e29e4ddd257836624a6221ec69df5b59e0cae0484a81c57ffe47c4b80db5f83abfea2734ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mpich-hpc-devel-static"
RDEPENDS:${PN} += "/bin/sh adios_1_13_1-gnu-mpich-hpc-devel-static"

inherit rpm
