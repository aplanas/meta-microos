SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python310-altgraph-0.17.3-2.3.noarch.rpm"
RPM_HASH = "7d9c368ca525c1f9f1ddf9a1890398334a1a6756e8daa5e73c6eaabf42f53bb49f83375e1ca67ce39e3d1bf8aeddfba03eca2ab0876be1fdedafaa63f3ca4888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-altgraph \
python310-altgraph \
python3dist-altgraph"

RDEPENDS:${PN} += "python-abi"

inherit rpm
