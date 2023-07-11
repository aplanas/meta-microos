SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python311-dragonmapper-0.2.6-3.3.noarch.rpm"
RPM_HASH = "9c016c6d1958b591a8fa106f6751ad986529d86496360efb3a11e4353325a0aac6dc8b20c4780603d5b8511280d3028317a4d8535dbaba8646fd84f07628f697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dragonmapper \
python3.11dist-dragonmapper \
python311-dragonmapper \
python3dist-dragonmapper"

RDEPENDS:${PN} += "python-abi \
python311-hanzidentifier \
python311-zhon"

inherit rpm
