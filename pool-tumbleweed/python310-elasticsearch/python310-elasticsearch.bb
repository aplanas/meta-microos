SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python310-elasticsearch-8.9.0-1.1.noarch.rpm"
RPM_HASH = "4dd20802eacc75fb4283c63148ab5468dab777f400448ef2b14c6568a2fb128cfa6500c19b2222f31bc2500f0e4bc0e48102996dc364a7317b887f08f5457e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-elasticsearch \
python310-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python310-elastic-transport"

inherit rpm
