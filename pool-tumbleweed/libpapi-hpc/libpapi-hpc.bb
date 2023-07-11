SUMMARY = "Dependency package for libpapi_7_0_0-hpc"
DESCRIPTION = "papi: Performance Application Programming Interface \
The package libpapi-hpc provides the dependency to get binary package libpapi_7_0_0-hpc. \
When this package gets updated it installs the latest version of papi_7_0_0-hpc."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "libpapi-hpc-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "17b4caaac88e87908f9d60466964f755e29ff75a3224fd8a70e5af5451889809060093806ed19348813b2a8c1bba8923201ffcf2b7e5dd771287124c6d970bac"

RPROVIDES:${PN} += "libpapi-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpapi-7-0-0-hpc"

inherit rpm
