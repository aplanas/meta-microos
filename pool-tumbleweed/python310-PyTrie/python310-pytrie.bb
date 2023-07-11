SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-PyTrie-0.4.0-1.13.noarch.rpm"
RPM_HASH = "9cadb53a5473fff4b314fb9bdd740eb0adf1919005ed578a6cd1c03afd3f099d890b6ac79788ea790d2f3335667b7302291b8ff85e8e2c62c709fd505ad8af01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytrie \
python310-PyTrie \
python310-pytrie \
python3dist-pytrie"

RDEPENDS:${PN} += "python-abi \
python310-sortedcontainers"

inherit rpm
