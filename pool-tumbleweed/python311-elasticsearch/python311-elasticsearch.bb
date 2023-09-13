SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python311-elasticsearch-8.9.0-1.1.noarch.rpm"
RPM_HASH = "0eca276b0bbcbcbcdc4413d1859f1ba4d2fac49c3799d9697efa6d51119e3a2e9f93a4255c0a81ff4113d45fb6371cab7e657a1f84b72f05e1dbf6f277336319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch \
python3.11dist-elasticsearch \
python311-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python311-elastic-transport"

inherit rpm
