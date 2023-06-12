SUMMARY = "Etrophy shared data"
DESCRIPTION = "Package containing edje file for ETrophy."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "etrophy-data-0.5.1-8.30.noarch.rpm"
RPM_HASH = "1e6c330189865889e6eec57c27a2d5df99b30618c6cb97d5a0396a9151f87e2ac2f337cd238e9577f903b6e151b3c58e4f85d8285577e1bd6c6033e58153386d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etrophy-data"
RDEPENDS:${PN} += ""

inherit rpm
