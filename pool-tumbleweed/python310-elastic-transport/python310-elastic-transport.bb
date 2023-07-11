SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python310-elastic-transport-8.4.0-4.3.noarch.rpm"
RPM_HASH = "6720e7b1bf073c952bd6c99f839fa3652300054b2aff57d5733aa3d023abb9051b254a35ca61e0b17ec8d42945cb1db160e8533b1dcae28dbdedf9b752a27a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-elastic-transport \
python310-elastic-transport \
python3dist-elastic-transport"

RDEPENDS:${PN} += "-python310-urllib3 >= 1.26.2 \
python-abi \
python310-certifi"

inherit rpm
