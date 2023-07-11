SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Official low-level client for Elasticsearch. Its goal is to provide common \
ground for all Elasticsearch-related code in Python; because of this it tries \
to be opinion-free and very extendable."
LICENSE = "Apache-2.0"

PV = "7.6.0"

RPM_NAME = "python311-elasticsearch-7.6.0-5.3.noarch.rpm"
RPM_HASH = "7843c6dab5ae0a92d12ef72b1ade774749cc18c2502242d9e38a187adb615ed2316646856ccfcc8b732a0c66d62db7f9961b5ce1dbb3822630a2e74bf5b1619b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch \
python3.11dist-elasticsearch \
python311-elasticsearch \
python3dist-elasticsearch"

RDEPENDS:${PN} += "python-abi \
python311-elastic-transport"

inherit rpm
