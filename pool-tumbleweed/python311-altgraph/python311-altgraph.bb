SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python311-altgraph-0.17.3-1.3.noarch.rpm"
RPM_HASH = "e8b76e671175191009f10d4c6b9b36b71f6a2a8f62da029dbd5adfb81706ab3af18e629eb5fca221584594386059dadf22807085a71ae0e2b718454b0524be41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(altgraph) \
python311-altgraph \
python3dist(altgraph)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
