SUMMARY = "Python module for defining quantities with units"
DESCRIPTION = "Units and dimensional analysis compatible with everything \
 \
This package implements units and dimensional analysis in an unconventional \
way with unique advantages: \
 \
* Compatible with everything \
* Zero storage overhead \
* Zero calculation overhead"
LICENSE = "MIT"

PV = "1.25"

RPM_NAME = "python310-numericalunits-1.25-1.9.noarch.rpm"
RPM_HASH = "4e906bb7a95de2c650b2fc74943db2d29c10715ba6ee3fdec662c0e456f9f2f826a6cd90b8891b98abd18cc3e78c4ff1f5cc3e5039e3fa6ee58b59df7daa1bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-numericalunits \
python310-numericalunits \
python3dist-numericalunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
