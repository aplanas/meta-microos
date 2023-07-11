SUMMARY = "Graph data structures and algorithms"
DESCRIPTION = "graph data structures and algorithms"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.9726"

RPM_NAME = "perl-Graph-0.9726-1.2.noarch.rpm"
RPM_HASH = "1f5579e5ee7c47c79db406f7f702f2e5e1f6d82961333ef10233a773a0df1ac16a2398a20a025e79af24b1547c7376a128b458bdead63f752fb49c7d503610e0"
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
