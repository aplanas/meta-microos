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

RPM_NAME = "python311-graphviz-0.20.1-2.3.noarch.rpm"
RPM_HASH = "38bf4af154bccf08cbcd9bf3cfbf50da73909ba6b210c26d63aa9387034282d1ee0aa6549407bf4e5c7de7a88d0f558f45b42c90e8e9efa958c6ba8ef828b69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphviz \
python3.11dist-graphviz \
python311-graphviz \
python3dist-graphviz"

RDEPENDS:${PN} += "graphviz \
python-abi"

inherit rpm
