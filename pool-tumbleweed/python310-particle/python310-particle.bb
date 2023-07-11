SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.22.1"

RPM_NAME = "python310-particle-0.22.1-1.1.noarch.rpm"
RPM_HASH = "bc7bd9c1c076488aa6d0d07d0512180b17dbc171e9e6c49939ddfd5dee510ff67206fec9d3faa8b3358cbcfaef4f715207b1a6bb1c1a61d74971cc5c9ddc1b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-particle \
python310-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-attrs \
python310-hepunits"

inherit rpm
