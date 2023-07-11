SUMMARY = "Dependency package for papi_7_0_0-hpc-devel"
DESCRIPTION = "papi: Performance Application Programming Interface \
The package papi-hpc-devel provides the dependency to get binary package papi_7_0_0-hpc-devel. \
When this package gets updated it installs the latest version of papi_7_0_0-hpc."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-hpc-devel-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "4d3e3d3c20f3a1920dd194937828fac59b7c2416c4aa39f84f3d36f0790d54923dd44d3501a4e6fa69d18b8073c20ad31f1693f43fc3dafc1664ea0dc5a283e1"

RPROVIDES:${PN} += "papi-hpc-devel"

RDEPENDS:${PN} += "papi-7-0-0-hpc-devel"

inherit rpm
