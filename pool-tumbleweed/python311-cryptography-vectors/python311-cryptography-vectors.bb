SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "40.0.2"

RPM_NAME = "python311-cryptography-vectors-40.0.2-2.1.noarch.rpm"
RPM_HASH = "4a4129e02246ad3aa8ed47f007f6239ca4e62369e067b56a5e13116f14c5a55c4f7acc02ba75de750d2e4f4fdb6f9f4ec44c1a782181ee639a1622799b09e98c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cryptography-vectors \
python311-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/bin/sh \
python-abi"

inherit rpm
