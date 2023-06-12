SUMMARY = "Units and constants in the HEP system of units"
DESCRIPTION = "hepunits collects the most commonly used units and constants in the HEP System \
of Units, as derived from the basic units originally defined by the CLHEP \
project."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python311-hepunits-2.0.1-1.11.noarch.rpm"
RPM_HASH = "30c68d9018daaa46044d22d4ae62ee76bcad46d8cea9365b4f9348674adb93dfa1e226c0bf54c2232916d9896d20a20c97fad86f293a8cde393d1dde8b45e81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hepunits) \
python311-hepunits \
python3dist(hepunits)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
