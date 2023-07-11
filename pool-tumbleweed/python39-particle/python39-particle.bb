SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.22.1"

RPM_NAME = "python39-particle-0.22.1-1.1.noarch.rpm"
RPM_HASH = "7861ab992e50cf0073a9184ae3ab6f61b174d44c2e4a108e2903942410b7f739c8f56aa6608da39f02763ebdd1df171dbb8b653f9f921ba5f373eb38d7fdfa3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-particle \
python39-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-attrs \
python39-hepunits"

inherit rpm
