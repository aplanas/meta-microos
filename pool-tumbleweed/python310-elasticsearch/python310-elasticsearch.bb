SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python310-elasticsearch-7.6.0-5.1.noarch.rpm"
RPM_HASH = "c40130da2af3ed9297b6242b306a96be012f33ecfb33250e26276966d8c771ef8e4c499f27b894288fd08ab18da9f7d30bd41cddc3fffe8746dacc9d1e842526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch \
python3.10dist-elasticsearch \
python310-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python310-elastic-transport"

inherit rpm
