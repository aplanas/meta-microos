SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python311-particle-0.22.0-1.1.noarch.rpm"
RPM_HASH = "93ff376bf8705a0f55bef4fab96b4395c982aee697a53c080e8864be7285dd2e6cbc704443a77c7ee54bc99d9cace15f1eb55538479507d1739af6f3af3e513f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(particle) \
python311-particle \
python3dist(particle)"

RDEPENDS:${PN} += "python(abi) \
python311-attrs \
python311-hepunits"

inherit rpm
