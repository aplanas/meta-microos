SUMMARY = "Dependency package for superlu_6_0_1-gnu-hpc-examples"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package superlu-gnu-hpc-examples provides the dependency to get binary package superlu_6_0_1-gnu-hpc-examples. \
When this package gets updated it installs the latest version of superlu_6_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu-gnu-hpc-examples-6.0.1-1.1.noarch.rpm"
RPM_HASH = "865eed75dac980235835b86f29bf3b063b55cf36ce992b7d8eb1ca2e724141875bd88f7ddfd676c88e600494a180b3e973ba567e2bc4054f35232a54ebf776ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-gnu-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
superlu-6-0-1-gnu-hpc-examples"

inherit rpm
