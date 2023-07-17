SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.2"

RPM_NAME = "python311-cryptography-vectors-41.0.2-1.1.noarch.rpm"
RPM_HASH = "e0ef869b8b8b720e6ac08c0998516c4850cd891fb5735bc9e9a40346e3bc767be04b188450df7a7b7b8e8ecbcbf2d1d1f9adc6a5340740bf64c7f8fe8849c752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cryptography-vectors \
python3.11dist-cryptography-vectors \
python311-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
