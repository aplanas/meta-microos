SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python311-objgraph-3.5.0-2.2.noarch.rpm"
RPM_HASH = "91c6ac01926a0013cea1ea905ec273b14e727519cfdbe0f07358d8d82fd6d50f35e94875f9e1509d95f4516078f741e5616e4f936582678d6f8a5a08669b1b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-objgraph \
python3.11dist-objgraph \
python311-objgraph \
python3dist-objgraph"

RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python-abi \
python311-graphviz"

inherit rpm
