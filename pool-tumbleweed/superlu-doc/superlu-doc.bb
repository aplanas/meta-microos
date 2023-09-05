SUMMARY = "Documentation for superlu"
DESCRIPTION = "Documentation (HTML/PDF) for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu-doc-6.0.1-1.1.noarch.rpm"
RPM_HASH = "a20481cc1884c448daa76e9df5ec9061c0bc8b7aa9c507da65175ecdb6346043446043f796b328b1ba4ce7021cd04ceb8f824ebf0f1852646d5aed0bdf5d2022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-doc"

RDEPENDS:${PN} += ""

inherit rpm
