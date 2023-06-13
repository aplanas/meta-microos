SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python39-pyaes-1.6.1-3.4.noarch.rpm"
RPM_HASH = "6628a9d63f5b72273e8d7f97618b8246c153af4ce040db9964f07481f8ee3e7dbb6792ace422b3664874d5e7b38497d92774e9d4a038d3181b64168046e571a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyaes) \
python39-pyaes \
python3dist(pyaes)"

RDEPENDS:${PN} += "python(abi) \
python39-pycryptodome"

inherit rpm
