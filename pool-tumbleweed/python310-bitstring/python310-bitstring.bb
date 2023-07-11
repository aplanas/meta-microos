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

RPM_NAME = "python310-bitstring-3.1.9-1.8.noarch.rpm"
RPM_HASH = "e66f283796274a5b2deef746a2b1c95ffd7d1f8ce6d923dd274af9dbce4f713249f36005cd9a58c7c193eb95ca06e2b75375ceeb3698994f3bd3a19c5f457e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bitstring \
python310-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
