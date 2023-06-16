SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-openmpi4-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-openmpi4-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi4-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-openmpi4-hpc-14.0.0-1.2.aarch64.rpm"
RPM_HASH = "67fc1c89bb2f4772c05fab5225ed83352151a2cc8735140e53d73c6a72ea652a78ae947c60cc9ba27e089a139284358d8ede4e94b0af581c88bc9f3bc8f9fa74"

RPROVIDES:${PN} += "libtrilinos-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtrilinos-14-0-0-gnu-openmpi4-hpc"

inherit rpm
