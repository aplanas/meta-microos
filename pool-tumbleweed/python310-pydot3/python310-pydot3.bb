SUMMARY = "Create (dot) graphs from python"
DESCRIPTION = "pydot allows to easily create both directed and non directed graphs from Python. \
Currently all attributes implemented in the Dot language are supported (up to Graphviz 2.16)."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python310-pydot3-1.0.9-3.7.noarch.rpm"
RPM_HASH = "a63595980c6ce8d77d651124bd83782496fe01732c3a70908d0a243a69c0e29948532071c6a2f8dd97daf96e00a07361e31ca3201143f7b840d5390a8ba1eb1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydot3 \
python3.10dist-pydot3 \
python310-pydot3 \
python3dist-pydot3"

RDEPENDS:${PN} += "graphviz \
python-abi \
python310-pyparsing"

inherit rpm
