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

RPM_NAME = "python311-graphviz-0.20.1-2.1.noarch.rpm"
RPM_HASH = "d0e5d1a87b77196619abb86e061b7377aa4b70313e3cab8a6b8608a5733196a6e5f309fc18054b44a6a241102b7401c4423fb7a4a80e93cb44376c3753c880f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(graphviz) \
python311-graphviz \
python3dist(graphviz)"

RDEPENDS:${PN} += "graphviz \
python(abi)"

inherit rpm
