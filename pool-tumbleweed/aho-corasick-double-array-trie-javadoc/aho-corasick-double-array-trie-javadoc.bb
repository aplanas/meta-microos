SUMMARY = "Javadoc for aho-corasick-double-array-trie"
DESCRIPTION = "This package contains javadoc for aho-corasick-double-array-trie."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "aho-corasick-double-array-trie-javadoc-1.2.1-2.10.noarch.rpm"
RPM_HASH = "a41cb5f3a64b31e2570f35581da0a2dec63ecabbf007dda619813f1a2ac589a791d90b2faad5fc02dd91c1f3b9543f737c6c75ddd16266b52c12ce6007f27219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aho-corasick-double-array-trie-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
