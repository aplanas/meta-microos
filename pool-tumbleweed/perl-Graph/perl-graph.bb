SUMMARY = "Graph data structures and algorithms"
DESCRIPTION = "graph data structures and algorithms"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.9727"

RPM_NAME = "perl-Graph-0.9727-1.1.noarch.rpm"
RPM_HASH = "a7de1a493cb7d5562a3cf97812dba0434bd122accb420831c389f8a850d1cd9db8008ddaa114d7003cef5e8f6e8373e58d558bb11463ead78ba9bcdc56a0a37f"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Heap \
perl-List--Util \
perl-Set--Object"

inherit rpm
