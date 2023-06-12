SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python39-particle-0.22.0-1.1.noarch.rpm"
RPM_HASH = "92d34ff4c9446d706ff30edd3debd11ca6b13f9aecfd230ba91d8170034f2b8d44d2746fcc54f270ebd6ea0010d69cd5f852acc1264f3b67031892ae5f66e47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(particle) \
python39-particle \
python3dist(particle)"
RDEPENDS:${PN} += "python(abi) \
python39-attrs \
python39-hepunits"

inherit rpm
