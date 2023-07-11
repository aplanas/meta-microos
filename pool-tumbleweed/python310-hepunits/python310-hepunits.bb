SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python310-hepunits-2.0.1-1.13.noarch.rpm"
RPM_HASH = "a794a588e32d184afe8223e40046a1ea09e7444d109bb399acfd0dfdc3c1476f1309f6160d12a1a935e4ce40d7a85ec8acae68527ea9e711c26f1367411f27b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hepunits \
python310-hepunits \
python3dist-hepunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
