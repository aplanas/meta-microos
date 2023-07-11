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

RPM_NAME = "python311-bitstring-3.1.9-1.8.noarch.rpm"
RPM_HASH = "c4ecefd9fda3244ef7097f91697e627059f12377a63193ee407952f265277c90808754bf6b14d27840b8530703e1f0c8922cff6c9a0a098a2c6276129018e0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bitstring \
python3.11dist-bitstring \
python311-bitstring \
python3dist-bitstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
