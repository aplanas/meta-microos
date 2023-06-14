SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python39-dragonmapper-0.2.6-3.1.noarch.rpm"
RPM_HASH = "354c179fc2de9bc452b5253bdc8f23e4d553d33b877c965f54e0433b64401958351650ab9e2055e29852ccad8438b2c49aaea3571fc9dc4546fcd4ff49a5b3ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dragonmapper \
python39-dragonmapper \
python3dist-dragonmapper"

RDEPENDS:${PN} += "python-abi \
python39-hanzidentifier \
python39-zhon"

inherit rpm
