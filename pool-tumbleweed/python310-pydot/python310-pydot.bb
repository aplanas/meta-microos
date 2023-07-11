SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-pydot-1.4.2-3.1.noarch.rpm"
RPM_HASH = "192a6c7d4f5bb46428769e2dfcb97a521a65ffa80391e32eaf04224ec3923c8d554ca19c4cba20ce7b951e4590e0d7975e9ed649204271f32fa9c68990739434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydot \
python310-pydot \
python3dist-pydot"

RDEPENDS:${PN} += "dejavu-fonts \
graphviz \
graphviz-gd \
python-abi \
python310-pyparsing"

inherit rpm
