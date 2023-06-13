SUMMARY = "Dependency package for papi_7_0_0-hpc-devel"
DESCRIPTION = "papi: Performance Application Programming Interface \
The package papi-hpc-devel provides the dependency to get binary package papi_7_0_0-hpc-devel. \
When this package gets updated it installs the latest version of papi_7_0_0-hpc."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-hpc-devel-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "20a64fa2de2726e12a7cf8e6784d8766f5e32b458758e4d5fc4233c5c4a2225a90468894cd9dd519f1eafbcf3a703fda008abb9722bd264375a83d657185f73d"

RPROVIDES:${PN} += "papi-hpc-devel \
papi-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "papi_7_0_0-hpc-devel"

inherit rpm
