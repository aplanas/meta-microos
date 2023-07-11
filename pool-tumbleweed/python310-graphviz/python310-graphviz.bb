SUMMARY = "Python interface for Graphviz"
DESCRIPTION = "This package facilitates the creation and rendering of graph descriptions in \
the DOT language of the Graphviz graph drawing software from Python. \
 \
It supports creating a graph object, assembling the graph by adding nodes and \
edges, and retrieving its DOT source code string, saving the source code to a \
file and rendering it with the Graphviz installation. \
 \
Using the view option/method, the resulting (PDF, PNG, SVG, etc.) file can be \
inspected with its default application. Graphs can also be rendered and \
displayed within IPython notebooks."
LICENSE = "MIT"

PV = "0.20.1"

RPM_NAME = "python310-graphviz-0.20.1-2.3.noarch.rpm"
RPM_HASH = "d7a9cc05682f3fa5824e128ec198a0c41221a5e6b60bd66cd0b65ee5c38fdd5f5a261f461dabc562420dbee6513fe88ea286d45a79dc9d1f1489f29bb104af38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-graphviz \
python310-graphviz \
python3dist-graphviz"

RDEPENDS:${PN} += "graphviz \
python-abi"

inherit rpm
