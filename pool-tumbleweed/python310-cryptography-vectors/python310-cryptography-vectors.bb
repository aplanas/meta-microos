SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.2"

RPM_NAME = "python310-cryptography-vectors-41.0.2-1.1.noarch.rpm"
RPM_HASH = "49971704a636dd4d857bf70b7f3f57609972a15469975b7cf04dff087fdc075e5359047bfe02ebe47cd2078bb5769c3d9340bfe509dedb4e44c07c32be49ef02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cryptography-vectors \
python310-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
