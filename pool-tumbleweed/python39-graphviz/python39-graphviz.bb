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

RPM_NAME = "python39-graphviz-0.20.1-2.3.noarch.rpm"
RPM_HASH = "8f70eb9a466fb98ba2572778340cf52ba8704d882f6eda1ff10f93350405a67f1526d00919586e00b19fbf76e11ae81dde66103382905a7153c8969f107234cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-graphviz \
python39-graphviz \
python3dist-graphviz"

RDEPENDS:${PN} += "graphviz \
python-abi"

inherit rpm
