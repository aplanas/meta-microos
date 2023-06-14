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

RPM_NAME = "python310-bitstring-3.1.9-1.6.noarch.rpm"
RPM_HASH = "ba9adf516e93f09508293dd899efa5c3f8c688f1854858ebfc107eb6f2b55396c8188d9148c372b31901077d473e437dc018dc7e05cf284c6f99882b8ac6c645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bitstring \
python3.10dist-bitstring \
python310-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
