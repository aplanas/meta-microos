SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python39-objgraph-3.5.0-2.1.noarch.rpm"
RPM_HASH = "092e4dad1db3ce124320b9cb5afed72bbef4bb25a938c2bde9daecaa5b836554c99da2ee9a2b345d1d25a4e46975bad2541349996c5958bf18311b49dab67e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(objgraph) \
python39-objgraph \
python3dist(objgraph)"
RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python(abi) \
python39-graphviz"

inherit rpm
