SUMMARY = "Dependency package for papi_7_0_0-hpc"
DESCRIPTION = "papi: Performance Application Programming Interface \
The package papi-hpc provides the dependency to get binary package papi_7_0_0-hpc. \
When this package gets updated it installs the latest version of papi_7_0_0-hpc."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-hpc-7.0.0-1.3.noarch.rpm"
RPM_HASH = "55f578f94f4115dcb3d1eb2b3845c8972308fd15e491ef4cb8c4edada6c83f047454e81ee3cc71c2ad1d21fe51a725067621ad3f070874f188048113eb3a1468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "papi-hpc"

RDEPENDS:${PN} += "/bin/sh \
papi_7_0_0-hpc"

inherit rpm
