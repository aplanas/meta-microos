SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python311-hepunits-2.0.1-1.13.noarch.rpm"
RPM_HASH = "fd34f40fbb091ad8728c83f734c1c7422141c2b46251a7f721f2a26a328615cbbc509df858ce904b9d332014e2cb5f24687cbe7ebaf7ef839756dcb65de63d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hepunits \
python3.11dist-hepunits \
python311-hepunits \
python3dist-hepunits"

RDEPENDS:${PN} += "python-abi"

inherit rpm
