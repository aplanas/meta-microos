SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.23.0"

RPM_NAME = "python311-particle-0.23.0-1.1.noarch.rpm"
RPM_HASH = "0cd4d7143a2579c5d4e76a1caecc6cc4dcf2cabd728739301a79b818c710fac62e3bd6a09916bcfbfdf27ff663267f4e37819a1d8db71f9ce0694737097b6cf3"
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
