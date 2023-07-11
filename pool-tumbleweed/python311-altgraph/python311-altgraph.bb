SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python311-altgraph-0.17.3-2.3.noarch.rpm"
RPM_HASH = "b15cb19ed880a37d925f2a2da2eee5a2cf558351fd9a2ccb949dcbdbce72fe344e652f6b57578a9c1f4e6f8c4ee800efae0b08fe64fa27b89670117aefedc336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-altgraph \
python3.11dist-altgraph \
python311-altgraph \
python3dist-altgraph"

RDEPENDS:${PN} += "python-abi"

inherit rpm
