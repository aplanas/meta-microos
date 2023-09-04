SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.3"

RPM_NAME = "python311-cryptography-vectors-41.0.3-1.1.noarch.rpm"
RPM_HASH = "d353b71abb546ac3e0544fa2be9fc96cc4e52ec1875a11d21cad05f6a2467c100abfe473adc74eb00cf19e9cbf292b10caf7fdee2bec20fbe968fb2a126c05bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cryptography-vectors \
python3.11dist-cryptography-vectors \
python311-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
