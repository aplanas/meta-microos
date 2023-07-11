SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi4-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi4-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi4-hpc-devel-1.13.1-5.15.noarch.rpm"
RPM_HASH = "7d50859b265b0cdc2acc4c80007d453c4b17875ff7b7963be365c8272f664501bade254b2211dfb5fb75b971dbde7c6623d6ca117ab0de3244f9e613bef5ccce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi4-hpc-devel"

inherit rpm
