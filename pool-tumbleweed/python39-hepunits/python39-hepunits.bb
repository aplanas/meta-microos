SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-hepunits-2.0.1-1.13.noarch.rpm"
RPM_HASH = "7de0c554e86abfc70f4f152b4079473b9a75a4ca1b4cd7ad284264d9dabcb120334894ffbeedad9cf6619c65ac7cff0a429ad5e823144a298e04173c20590b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hepunits \
python39-hepunits \
python3dist-hepunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
