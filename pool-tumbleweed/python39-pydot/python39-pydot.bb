SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-pydot-1.4.2-2.9.noarch.rpm"
RPM_HASH = "8c98ba31681bfc320dcc96897d67dda1afcece5075548a68d159af22ab9ac139575dd171e39e4cff73c8eeb2a83200e8c0798931b21c52561860522c2f20312f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydot) \
python39-pydot \
python3dist(pydot)"
RDEPENDS:${PN} += "dejavu-fonts \
graphviz \
graphviz-gd \
python(abi) \
python39-pyparsing"

inherit rpm
