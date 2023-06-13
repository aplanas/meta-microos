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

RPM_NAME = "python310-graphviz-0.20.1-2.1.noarch.rpm"
RPM_HASH = "1e36cdb02174069942d48cfe0614ccb0473f1dce2127884c556bf2d4f3ae5c8558afb9b5eb7cc2a03c4e80323be624f5e2147d5594c490a4db88189baaaee71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphviz \
python3.10dist(graphviz) \
python310-graphviz \
python3dist(graphviz)"

RDEPENDS:${PN} += "graphviz \
python(abi)"

inherit rpm
