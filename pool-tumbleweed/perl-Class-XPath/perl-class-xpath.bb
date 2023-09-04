SUMMARY = "Adds xpath matching to object trees"
DESCRIPTION = "This module adds XPath-style matching to your object trees. This means that \
you can find nodes using an XPath-esque query with 'match()' from anywhere \
in the tree. Also, the 'xpath()' method returns a unique path to a given \
node which can be used as an identifier. \
 \
To use this module you must already have an OO implementation of a tree. \
The tree must be a true tree - all nodes have a single parent and the tree \
must have a single root node. Also, the order of children within a node \
must be stable. \
 \
*NOTE:* This module is not yet a complete XPath implementation. Over time I \
expect the subset of XPath supported to grow. See the SYNTAX documentation \
for details on the current level of support."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.4"

RPM_NAME = "perl-Class-XPath-1.4-161.28.noarch.rpm"
RPM_HASH = "f2c1e12b3f2ba2a19e623ee615d5003312eb51448a38c57c0e31efb54fb6f83668d115d0c8d346776e6c832ad3be2988efc62426a5cb1d366091595a395a13c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--XPath \
perl-Class-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
