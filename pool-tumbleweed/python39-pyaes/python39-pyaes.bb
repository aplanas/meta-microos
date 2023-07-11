SUMMARY = "Pure-Python Implementation of the AES block-cipher"
DESCRIPTION = "A pure-Python implementation of the AES (FIPS-197) block-cipher algorithm \
and common modes of operation (CBC, CFB, CTR, ECB, OFB) with no dependencies \
beyond standard Python libraries. See README.md for API reference and details."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python39-pyaes-1.6.1-3.5.noarch.rpm"
RPM_HASH = "340a2ca6e16687eeb6613a379491d28709672d2d5830c3787ff11b3eb2e906f3b3dc71fdf6cfaa81a8ce4b029f2efba11f2f93c38707cd28539034fe8e3eda77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyaes \
python39-pyaes \
python3dist-pyaes"

RDEPENDS:${PN} += "python-abi \
python39-pycryptodome"

inherit rpm
