SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.3"

RPM_NAME = "python39-cryptography-vectors-41.0.3-1.1.noarch.rpm"
RPM_HASH = "37e481892ac77a33100faa2c9b85c1fe9c31d82d0e3a86dfd9884b770475573858d1c582563286ef11d0b0f0573262185e885ae7fecc9576096bcebb18f127b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cryptography-vectors \
python39-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
