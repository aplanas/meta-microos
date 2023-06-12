SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python311-elastic-transport-8.4.0-4.1.noarch.rpm"
RPM_HASH = "e63634cc817dee661d9790fbd50f366e62f40050469e155dbf4cc29992991ba3113d381a481e0b7f3347566e2ad253e31a4164651faa6b4d270b6ccfac8d27ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(elastic-transport) \
python311-elastic-transport \
python3dist(elastic-transport)"
RDEPENDS:${PN} += "(python311-urllib3 >= 1.26.2) \
python(abi) \
python311-certifi"

inherit rpm
