SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python311-dragonmapper-0.2.6-3.1.noarch.rpm"
RPM_HASH = "fc1b1621e348ae244a82555f9597bfee402405d02c75e0fb3c4e3df99448f6ab77c6b8399988eec388b58ded09dca69c59b25abedea0b9e7c5e58b1cefa8b4e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dragonmapper) \
python311-dragonmapper \
python3dist(dragonmapper)"
RDEPENDS:${PN} += "python(abi) \
python311-hanzidentifier \
python311-zhon"

inherit rpm
