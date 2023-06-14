SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python310-objgraph-3.5.0-2.1.noarch.rpm"
RPM_HASH = "d62220be5a8900aa84aa5c34552cdec368e87a937f8ed5d473f9d025766375504a80dc3bbb09bf32abd3bfa8a0d706b935b54baa280ab214ae98018d786289db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-objgraph \
python3.10dist-objgraph \
python310-objgraph \
python3dist-objgraph"

RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python-abi \
python310-graphviz"

inherit rpm
