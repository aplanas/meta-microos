SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-PyTrie-0.4.0-1.13.noarch.rpm"
RPM_HASH = "761ef54444581d2371ae13bc99853af6a6e77631295a278796e2687120880efa036cbcc54d0553e128b62b202171b2a9d7959674d6b85780b067005c694bda9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyTrie \
python3-pytrie \
python3.11dist-pytrie \
python311-PyTrie \
python311-pytrie \
python3dist-pytrie"

RDEPENDS:${PN} += "python-abi \
python311-sortedcontainers"

inherit rpm
