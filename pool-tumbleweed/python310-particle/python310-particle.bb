SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python310-particle-0.22.0-1.1.noarch.rpm"
RPM_HASH = "6ecbd737b150bbea95bbb0c7a45cc35f09f18ec60fa83430a196811c11f8304bcb5af6b21ba1ee857715376e7a8fed4bd8679e4c7d77f7cd43eb943b90ac52b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-particle \
python3.10dist-particle \
python310-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-hepunits"

inherit rpm
