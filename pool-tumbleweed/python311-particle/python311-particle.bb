SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.22.1"

RPM_NAME = "python311-particle-0.22.1-1.1.noarch.rpm"
RPM_HASH = "bfb01fe7a146b4533e33d581a2a17e64171ac07d49509732316c4c1b9510fcd4154f6a0f0802b5f28bf15163f361c5d40bbddafc8d2b686ae6965e781c2fee87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-particle \
python3.11dist-particle \
python311-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-attrs \
python311-hepunits"

inherit rpm
