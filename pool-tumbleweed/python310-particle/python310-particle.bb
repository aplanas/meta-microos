SUMMARY = "PDG particle data and identification codes"
DESCRIPTION = "Particle provides a pythonic interface to the Particle Data Group (PDG) \
particle data tables and particle identification codes."
LICENSE = "BSD-3-Clause"

PV = "0.23.0"

RPM_NAME = "python310-particle-0.23.0-1.1.noarch.rpm"
RPM_HASH = "aaf3a43f1b584fb8608fad0eb85084536aa51809ac3e21f495bbfb2b4ed73292ce587f51a7aecaf042592957d10f2db82f50ac18d0c8961199d25775bda3dde9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-particle \
python310-particle \
python3dist-particle"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-attrs \
python310-hepunits"

inherit rpm
