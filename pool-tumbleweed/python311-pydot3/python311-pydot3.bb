SUMMARY = "Create (dot) graphs from python"
DESCRIPTION = "pydot allows to easily create both directed and non directed graphs from Python. \
Currently all attributes implemented in the Dot language are supported (up to Graphviz 2.16)."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python311-pydot3-1.0.9-3.8.noarch.rpm"
RPM_HASH = "64595a60f16f0f3726e4b6898462245b2397a1b911b199b82848519becddea653c0868b77bcdfd4c8a6b0bff4a93f33580d20dbe33b4df4f060bd22cb5be50a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydot3 \
python3.11dist-pydot3 \
python311-pydot3 \
python3dist-pydot3"

RDEPENDS:${PN} += "graphviz \
python-abi \
python311-pyparsing"

inherit rpm
