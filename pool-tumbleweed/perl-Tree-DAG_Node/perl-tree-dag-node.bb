SUMMARY = "An N-ary tree"
DESCRIPTION = "This class encapsulates/makes/manipulates objects that represent nodes in a \
tree structure. The tree structure is not an object itself, but is emergent \
from the linkages you create between nodes. This class provides the methods \
for making linkages that can be used to build up a tree, while preventing \
you from ever making any kinds of linkages which are not allowed in a tree \
(such as having a node be its own mother or ancestor, or having a node have \
two mothers)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.32"

RPM_NAME = "perl-Tree-DAG_Node-1.32-1.11.noarch.rpm"
RPM_HASH = "acf6f763e6f828298756690d9d9c0aa320a75ca2f7a90b5e04f4aa9d9e7441726d99c52e89b70e34fa91fd5e1ccb684908fef218e0abb2ed6355f202a651717a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tree--DAG-Node \
perl-Tree-DAG-Node"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Slurp--Tiny"

inherit rpm
