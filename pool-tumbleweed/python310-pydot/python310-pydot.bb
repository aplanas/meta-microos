SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-pydot-1.4.2-2.9.noarch.rpm"
RPM_HASH = "c5382879434c2e48db2bc9041639cf357a6dd05e258ae7485b609049742d5b0c14d3320c10d50c3dccf30d7095c6dce5222a12f696005bbbaa1d8f1ab8d2b4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydot \
python3.10dist(pydot) \
python310-pydot \
python3dist(pydot)"
RDEPENDS:${PN} += "dejavu-fonts \
graphviz \
graphviz-gd \
python(abi) \
python310-pyparsing"

inherit rpm
