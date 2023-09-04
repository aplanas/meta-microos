SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.3"

RPM_NAME = "python310-cryptography-vectors-41.0.3-1.1.noarch.rpm"
RPM_HASH = "11deb3c99dcc7e298afa89c5b630b9fe5eca8a6ed71a3f3530074664db5be8b48216d9fee3a7be0e29e69965ecc117c7acad38fa097f5a3e2833daafce76adcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cryptography-vectors \
python310-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
