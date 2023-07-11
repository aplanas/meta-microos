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

RPM_NAME = "python39-bitstring-3.1.9-1.8.noarch.rpm"
RPM_HASH = "9183ad977669c55e81920e72ea1c691c7de81914df88c83b7ff2e92c68f70ca9f4cea6c153854f7008dfded27b9b3fe6ea89bea697675b58fb58d3bdd45bf4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bitstring \
python39-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
