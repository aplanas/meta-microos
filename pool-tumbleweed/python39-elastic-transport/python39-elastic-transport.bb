SUMMARY = "Transport classes and utilities shared among Python Elastic client libraries"
DESCRIPTION = "Transport classes and utilities shared among Python Elastic client libraries"
LICENSE = "Apache-2.0"

PV = "8.4.0"

RPM_NAME = "python39-elastic-transport-8.4.0-4.1.noarch.rpm"
RPM_HASH = "51125d1894066abdb6778a67ce7a4ce22594749cdd395f05b5a732ce2434f926a10b262c50a62f9a4d9d368e058439ec3228b90e9bc75ecf66fbca2dd856241a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elastic-transport \
python39-elastic-transport \
python3dist-elastic-transport"

RDEPENDS:${PN} += "-python39-urllib3 >= 1.26.2 \
python-abi \
python39-certifi"

inherit rpm
