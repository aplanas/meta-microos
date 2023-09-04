SUMMARY = "Graph data structures and algorithms"
DESCRIPTION = "graph data structures and algorithms"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.9727"

RPM_NAME = "perl-Graph-0.9727-1.2.noarch.rpm"
RPM_HASH = "ffb38d5e01466c7aab8e420adb51a6a544c5b5b9bc6cc9ea50c01787588379a29fd66ac9c6107ef88817c9fad887ef234eb37cc3be4a3794765f99e25ec399ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graph \
perl-Graph--AdjacencyMap \
perl-Graph--AdjacencyMap--Light \
perl-Graph--AdjacencyMatrix \
perl-Graph--Attribute \
perl-Graph--BitMatrix \
perl-Graph--Directed \
perl-Graph--MSTHeapElem \
perl-Graph--Matrix \
perl-Graph--SPTHeapElem \
perl-Graph--TransitiveClosure \
perl-Graph--TransitiveClosure--Matrix \
perl-Graph--Traversal \
perl-Graph--Traversal--BFS \
perl-Graph--Traversal--DFS \
perl-Graph--Undirected \
perl-Graph--UnionFind"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Heap \
perl-List--Util \
perl-Set--Object"

inherit rpm
