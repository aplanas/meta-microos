SUMMARY = "Create (dot) graphs from python"
DESCRIPTION = "pydot allows to easily create both directed and non directed graphs from Python. \
Currently all attributes implemented in the Dot language are supported (up to Graphviz 2.16)."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python39-pydot3-1.0.9-3.8.noarch.rpm"
RPM_HASH = "3144e8b0f5a6a70c7fa75b5e5699e7be25d4f66ceb5414f8bca3ede82ab78452dfd28357472b1e0bddb09ac95e52e34f60b71c854d685b6a647ea7740658b3b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydot3 \
python39-pydot3 \
python3dist-pydot3"

RDEPENDS:${PN} += "graphviz \
python-abi \
python39-pyparsing"

inherit rpm
