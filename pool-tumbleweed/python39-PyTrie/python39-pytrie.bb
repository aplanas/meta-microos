SUMMARY = "A pure Python implementation of the trie data structure"
DESCRIPTION = "pytrie is a pure Python 3 implementation of the trie data structure. \
 \
A trie is an ordered tree data structure that is used to store a mapping \
where the keys are sequences, usually strings over an alphabet. In addition to \
implementing the mapping interface, tries allow finding the items for a given \
prefix, and vice versa, finding the items whose keys are prefixes of a given key."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-PyTrie-0.4.0-1.13.noarch.rpm"
RPM_HASH = "de1397bb9353c3f3b057de221807f0996dd4e265ecf93b5a44647057ad971f3ac75fc4c5d5c303c37109ebed39baaed168d792fccf1f5e0db2a92675cac5a666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytrie \
python39-PyTrie \
python39-pytrie \
python3dist-pytrie"

RDEPENDS:${PN} += "python-abi \
python39-sortedcontainers"

inherit rpm
