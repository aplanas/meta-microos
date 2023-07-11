SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.1"

RPM_NAME = "python310-cryptography-vectors-41.0.1-2.1.noarch.rpm"
RPM_HASH = "b45ae9991bdeb44c2fc8913e9144d261936297d55ed745c30b759711dae6ce64ea677ea0ef70b6c24274016656cd49423db59a08d2e9b6350118825856210ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cryptography-vectors \
python310-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
