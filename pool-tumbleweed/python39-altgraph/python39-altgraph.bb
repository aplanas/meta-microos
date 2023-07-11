SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python39-altgraph-0.17.3-2.3.noarch.rpm"
RPM_HASH = "2195149eeff7805457aaa1987c09d842f02c3ee46081b58d0a1155b5fc28c109754633e6ebb37b175d6f56a1623f77e0565e7e30226e649d8a5fce622998db7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-altgraph \
python39-altgraph \
python3dist-altgraph"

RDEPENDS:${PN} += "python-abi"

inherit rpm
