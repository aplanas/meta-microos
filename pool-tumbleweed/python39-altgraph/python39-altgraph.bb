SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python39-altgraph-0.17.3-1.3.noarch.rpm"
RPM_HASH = "90f1d7773dcd5bd1fd57a1cee26aecc104e1bec7876badc4ca3e09a51e0a9c6c584649bec809144e36b3d4f97f2ba78a07ea595fcfcabc04b82d2a8607ed94e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(altgraph) \
python39-altgraph \
python3dist(altgraph)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
