SUMMARY = "Create (dot) graphs from python"
DESCRIPTION = "pydot allows to easily create both directed and non directed graphs from Python. \
Currently all attributes implemented in the Dot language are supported (up to Graphviz 2.16)."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "python310-pydot3-1.0.9-3.8.noarch.rpm"
RPM_HASH = "d57912325e545a3dcdd8e4c9a6e651ba3f8a926147b76c4461db4dc32455d5c9c1ac5d5903ac928efb5f23ccf093bbe4ab40788866340f490c4e563509293d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydot3 \
python310-pydot3 \
python3dist-pydot3"

RDEPENDS:${PN} += "graphviz \
python-abi \
python310-pyparsing"

inherit rpm
