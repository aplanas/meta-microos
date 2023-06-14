SUMMARY = "Create (dot) graphs from python"
DESCRIPTION = "pydot allows to easily create both directed and non directed graphs from Python. \
Currently all attributes implemented in the Dot language are supported (up to Graphviz 2.16)."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python39-pydot3-1.0.9-3.7.noarch.rpm"
RPM_HASH = "ee1c2f7a3fa294ea18be5e4b5edf9c0fd0a3e5562b2816f9ec8ce51cf2d84f6deb0c4a65986aedcf2a3e328ee35ce79190d7fd4d847514055629342d4419ca1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydot3 \
python39-pydot3 \
python3dist-pydot3"

RDEPENDS:${PN} += "graphviz \
python-abi \
python39-pyparsing"

inherit rpm
