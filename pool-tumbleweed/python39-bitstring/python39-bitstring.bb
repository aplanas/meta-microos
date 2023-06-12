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

RPM_NAME = "python39-bitstring-3.1.9-1.6.noarch.rpm"
RPM_HASH = "5be12f4b5c6a15c5b51f616cc60d07c4ae43b19e5c0ee03f01fcfcf0c906e16f844ac22f49650ba669523b21a0374f2e362f0d6bfc5241ee24954f6224ff42df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bitstring) \
python39-bitstring \
python3dist(bitstring)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
