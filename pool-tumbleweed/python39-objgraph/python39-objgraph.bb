SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python39-objgraph-3.5.0-2.2.noarch.rpm"
RPM_HASH = "2e55628cc3cb7b263f312478c783325c8c9ee9ef1317b90fbe3c2f7de2b55a304c979892e8afb41fc84b7d98001a97923a4687dacab0b6df6eb650df155e2387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-objgraph \
python39-objgraph \
python3dist-objgraph"

RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python-abi \
python39-graphviz"

inherit rpm
