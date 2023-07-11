SUMMARY = "Aho Corasick algorithm implementation based on Double Array Trie"
DESCRIPTION = "An extremely fast implementation of Aho Corasick algorithm based on Double Array Trie."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "aho-corasick-double-array-trie-1.2.1-2.11.noarch.rpm"
RPM_HASH = "3c9b9a58b9e21db05634d0ad0a90ca25424c04479cf06382edd3e40ca92deffa64746a882e60c059705e4c919b8b6f7d180c156d456dd1093aa8eab42c55139b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aho-corasick-double-array-trie \
mvn-com.hankcs-aho-corasick-double-array-trie \
mvn-com.hankcs-aho-corasick-double-array-trie-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
