SUMMARY = "Tutorial documentation for VOTCA Coarse Graining Engine"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the tutorial documentation and sample data."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-tutorials-2022.1-3.7.noarch.rpm"
RPM_HASH = "2acf5272b9ac36f502b09a276677b3c7285cfcc86cb17dac85d9a20c1c1951487ccf1f8dea02bb0aedfe2679ed43b3e29fd9d1619ce0ba530f93b5c779dc72cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "votca-csg-tutorials \
votca-tutorials"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python2 \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
