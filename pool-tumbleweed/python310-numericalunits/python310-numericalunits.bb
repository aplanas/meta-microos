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

RPM_NAME = "python310-numericalunits-1.25-1.8.noarch.rpm"
RPM_HASH = "e76eb534c0183a386dc9bf71f7d5da33f0582ffa3d4a6f9ca150440628f8d78413ad177f15f887f19e63b6c18d8022cd03754cec654d06b339194799346f86cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-numericalunits \
python3.10dist(numericalunits) \
python310-numericalunits \
python3dist(numericalunits)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
