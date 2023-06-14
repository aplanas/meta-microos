SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python311-elasticsearch-7.6.0-5.1.noarch.rpm"
RPM_HASH = "87df085fe1171ad43c591cac916731e2e310a0572eeffd48cdb38c52c7356f6f54c576f03fe03444518cf16f70e3cb0c42ebdbf9ffca683f2f382e3a9d9bfb2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-elasticsearch \
python311-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python311-elastic-transport"

inherit rpm
