SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-hepunits-2.0.1-1.11.noarch.rpm"
RPM_HASH = "7232eb82a1349bca45e13c8f700d6cb37a13f362e3e5f85e9af791dfff47e3131c4b1d085e42226827d4297594d422964e31f8d060e22d070c0a62cf1f3ce1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hepunits \
python39-hepunits \
python3dist-hepunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
