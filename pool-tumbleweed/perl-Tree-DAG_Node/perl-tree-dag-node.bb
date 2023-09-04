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

RPM_NAME = "perl-Tree-DAG_Node-1.32-1.12.noarch.rpm"
RPM_HASH = "f23c0d5b21ec0b298d091254f3d46bac09ec517ec3fb839101add8517ec9bb6c3c1c4d7ecf1a3514e62e29f7866e0d5e9011f39d6b840779820788c08fbc94fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tree--DAG-Node \
perl-Tree-DAG-Node"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Slurp--Tiny"

inherit rpm
