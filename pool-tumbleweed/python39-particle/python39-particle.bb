SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.23.0"

RPM_NAME = "python39-particle-0.23.0-1.1.noarch.rpm"
RPM_HASH = "0ec6e3f2f5a78409390e877a4f7a794340e604398ccf3d8a94ba3ea9bd9b97e1e55b7dd6726cf5dd7447da565e84198f3c06411d8a9e6958fc1fd324125f3af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-particle \
python39-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-attrs \
python39-hepunits"

inherit rpm
