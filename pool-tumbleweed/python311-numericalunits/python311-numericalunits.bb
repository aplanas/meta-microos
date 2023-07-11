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

RPM_NAME = "python311-numericalunits-1.25-1.9.noarch.rpm"
RPM_HASH = "c093a8d388ed9c0216a725b93e4f30bff72389c83addef7d42c6b7dd6cad0b31fb9f1f1ca57a62854452435a63278df319b76f04c4dbd3d824ece4fdf276ed8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-numericalunits \
python3.11dist-numericalunits \
python311-numericalunits \
python3dist-numericalunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
