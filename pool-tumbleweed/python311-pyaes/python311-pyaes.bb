SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python311-pyaes-1.6.1-3.5.noarch.rpm"
RPM_HASH = "ba9722c9a97affef9c6bbf1780e101f62d0796a6460a885ddd56809bb96492bcf39365c802f031bef2647345850e92041f4a450bfdd614fce145778cf8df8e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyaes \
python3.11dist-pyaes \
python311-pyaes \
python3dist-pyaes"

RDEPENDS:${PN} += "python-abi \
python311-pycryptodome"

inherit rpm
