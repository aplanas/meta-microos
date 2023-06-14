SUMMARY = "Graph data structures and algorithms"
DESCRIPTION = "graph data structures and algorithms"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.9726"

RPM_NAME = "perl-Graph-0.9726-1.1.noarch.rpm"
RPM_HASH = "6317915690c26be4fe37fba76769c54e19d4d0045b32d06dd81b4c5eb65f7a697ab621336cf979dc7cb9b00659748593cb7abea0d0b63be681e8df4822ec1d09"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Heap \
perl-List--Util \
perl-Set--Object"

inherit rpm
