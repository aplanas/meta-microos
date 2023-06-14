SUMMARY = "Python module for the construction, analysis and modification of binary data"
DESCRIPTION = "Bitstring is a pure Python module to aid \
the creation and analysis of binary data. \
 \
Bitstrings can be constructed from integers (big and little endian), hex, \
octal, binary, strings or files. They can be sliced, joined, reversed, \
inserted into, overwritten, etc. with functions or slice notation. \
They can also be read from, searched and replaced, and navigated in, \
similar to a file or stream."
LICENSE = "MIT"

PV = "3.1.9"

RPM_NAME = "python311-bitstring-3.1.9-1.6.noarch.rpm"
RPM_HASH = "aaabc7aca4cf1e24cfc39dde61402fe81e82c54bc70dd13b531f181090ccfb0dc1030b764e45eab68b008046bf29cfcf0820a7014105365cce78ab7a64da9027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bitstring \
python311-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
