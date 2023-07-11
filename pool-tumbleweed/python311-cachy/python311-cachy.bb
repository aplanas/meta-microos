SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-cachy-0.3.0-5.3.noarch.rpm"
RPM_HASH = "382be90e78b99d147eabd49130ce9bff1cd020b0973fd473c05018b0366e37611f4b406cc9fc5d17bfddc4bb20b6c57b8cffb17a45b42b3c7d5aa422ca6e7da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachy \
python3.11dist-cachy \
python311-cachy \
python3dist-cachy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
