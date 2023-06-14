SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python310-elastic-transport-8.4.0-4.1.noarch.rpm"
RPM_HASH = "7515e54f6e58e5481dd75cf301ed433dac538c1a226c657e84781d165eb97b8f0bf71e17bab0cc8f64a332d281d0d99c347c114607380212b6175d1f7e69e4bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elastic-transport \
python3.10dist-elastic-transport \
python310-elastic-transport \
python3dist-elastic-transport"

RDEPENDS:${PN} += "-python310-urllib3 >= 1.26.2 \
python-abi \
python310-certifi"

inherit rpm
