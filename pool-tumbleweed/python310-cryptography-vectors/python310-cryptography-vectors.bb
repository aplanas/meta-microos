SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "40.0.2"

RPM_NAME = "python310-cryptography-vectors-40.0.2-2.1.noarch.rpm"
RPM_HASH = "1be1bfd2e1deccbcb21d6f940d02afcd2d1021b56affbc753dcb17b667835865c7463c927ebdedfb5298119b7d45b46ad6bd04a14ee6d7f8ba83c0524a9c7ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cryptography-vectors \
python3.10dist-cryptography-vectors \
python310-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/bin/sh \
python-abi"

inherit rpm
