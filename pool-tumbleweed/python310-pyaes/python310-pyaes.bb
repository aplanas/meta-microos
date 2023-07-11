SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python310-pyaes-1.6.1-3.5.noarch.rpm"
RPM_HASH = "528107b680652a2986ee329cc0fabe764fa2c56fa85c4f6dc1db3eecf3f877b50bfa7a683b6bfed5369285fd3c810b0c570fa97b4dd3f76ee9e5977105d9e1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyaes \
python310-pyaes \
python3dist-pyaes"

RDEPENDS:${PN} += "python-abi \
python310-pycryptodome"

inherit rpm
