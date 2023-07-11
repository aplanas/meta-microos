SUMMARY = "Dependency package for papi_7_0_0-hpc"
DESCRIPTION = "papi: Performance Application Programming Interface \
The package papi-hpc provides the dependency to get binary package papi_7_0_0-hpc. \
When this package gets updated it installs the latest version of papi_7_0_0-hpc."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-hpc-7.0.0-1.4.noarch.rpm"
RPM_HASH = "0bdfd4d595a8bdc604386162de295afd8e624513dc627753f733722d6eccfa46bef80330eee59b679b6d04d40d6e58fe68eaab988b2e07c8bc7098925339d4e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "papi-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
papi-7-0-0-hpc"

inherit rpm
