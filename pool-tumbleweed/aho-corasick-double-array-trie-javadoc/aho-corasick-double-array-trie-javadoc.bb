SUMMARY = "Javadoc for aho-corasick-double-array-trie"
DESCRIPTION = "This package contains javadoc for aho-corasick-double-array-trie."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "aho-corasick-double-array-trie-javadoc-1.2.1-2.11.noarch.rpm"
RPM_HASH = "e035866423e98f337e540cfb7092f6b4101087130d089ced97009359edde7080fcebcb49321416f99014de3b5ec616fed4d7088bf45b1693fc98163fb779c245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aho-corasick-double-array-trie-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
