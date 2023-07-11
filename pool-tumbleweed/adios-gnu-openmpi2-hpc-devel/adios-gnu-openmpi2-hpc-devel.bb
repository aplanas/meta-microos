SUMMARY = "Dependency package for adios_1_13_1-gnu-openmpi2-hpc-devel"
DESCRIPTION = "adios: The Adaptable IO System (ADIOS) \
The package adios-gnu-openmpi2-hpc-devel provides the dependency to get binary package adios_1_13_1-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of adios_1_13_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios-gnu-openmpi2-hpc-devel-1.13.1-5.15.noarch.rpm"
RPM_HASH = "5580860945f16268cabf1349b1e049adccbbddd41e93fd897df72292de7bf8b8eeda04bc45757e3e17f2b14dde2483a6396099311bfd5fa25fb0efe9439436bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adios-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
adios-1-13-1-gnu-openmpi2-hpc-devel"

inherit rpm
