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

RPM_NAME = "perl-Class-XPath-1.4-161.27.noarch.rpm"
RPM_HASH = "25ab1a059dd2c11bdd84278fa81b2a9c9e91d59ee889bc6645d1268cfe37e4cfd7ad8b4e0237898999d52f15d66eb05615318e4c7c05f325f7a7c3d2fa84990d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--XPath \
perl-Class-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
