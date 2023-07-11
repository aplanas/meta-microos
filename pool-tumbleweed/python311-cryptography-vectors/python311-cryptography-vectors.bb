SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.1"

RPM_NAME = "python311-cryptography-vectors-41.0.1-2.1.noarch.rpm"
RPM_HASH = "d7112a2e9268fa2979f64b88ca0d5b2f0ea79723007b605d56b5cb462de779c9ce77e157468211ef31dea5c6290eefc28574f62e218d38b09559a8070ae64dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cryptography-vectors \
python3.11dist-cryptography-vectors \
python311-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
