SUMMARY = "Documentation for python-altgraph"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python-altgraph-doc-0.17.3-2.3.noarch.rpm"
RPM_HASH = "79e6ca97e9d658a2660c6b41ecd539e4dcf242ad7bf005358df35b39132983d36dfa18811c5fb28b0da0c6c9be2134ee52d5e5407e2f99639569372d834cdd31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-altgraph-doc \
python310-altgraph-doc \
python311-altgraph-doc \
python39-altgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
