SUMMARY = "Dependency package for adios_1_13_1-gnu-mpich-hpc"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-mpich-hpc provides the dependency to get binary package adios_1_13_1-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-mpich-hpc-1.13.1-5.15.noarch.rpm"
RPM_HASH = "806d096efbedb0d8dc028a1264fa36384be3fb92466d846f7ca36f1fd0aec598a1879868ee8a11f75451e3a7961a8916c38ba8837fc0f9e86737b7df2e189902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-mpich-hpc"

inherit rpm
