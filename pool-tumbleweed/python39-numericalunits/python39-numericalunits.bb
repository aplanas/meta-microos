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

RPM_NAME = "python39-numericalunits-1.25-1.9.noarch.rpm"
RPM_HASH = "92cfc5c9fbf31f59a7c0703ab8993b2cb1c613db9506196a6f0f56b4635c12f0aefd87bb139d5d8e2a867802d0df754a5d1365c450f33b850f5728320acc9325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-numericalunits \
python39-numericalunits \
python3dist-numericalunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
