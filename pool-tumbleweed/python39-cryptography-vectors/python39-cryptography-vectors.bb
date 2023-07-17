SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.2"

RPM_NAME = "python39-cryptography-vectors-41.0.2-1.1.noarch.rpm"
RPM_HASH = "6df9c3f902e4e146f344dd91f9c2c559aaddab20fe3159c3a33ff965866d5c4d371bc19f546039f4937d0030bafcdc7a04f3f19e5ecc17c90f354177d2c8a141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cryptography-vectors \
python39-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
