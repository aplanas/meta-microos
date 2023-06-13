SUMMARY = "Aho Corasick algorithm implementation based on Double Array Trie"
DESCRIPTION = "An extremely fast implementation of Aho Corasick algorithm based on Double Array Trie."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "aho-corasick-double-array-trie-1.2.1-2.10.noarch.rpm"
RPM_HASH = "22548796890491b1fae25d8b2d6cae2f2b5f7f7e662bfd9cbd77af8d5785555105e66f1cdeb5e9b27e88d3432a34b092fbeaaa541ef76fb40ae744a4503c233e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aho-corasick-double-array-trie \
mvn(com.hankcs:aho-corasick-double-array-trie) \
mvn(com.hankcs:aho-corasick-double-array-trie:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
