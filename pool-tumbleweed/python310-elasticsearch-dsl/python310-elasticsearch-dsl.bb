SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python310-elasticsearch-dsl-8.9.0-1.1.noarch.rpm"
RPM_HASH = "b1d1ac6878df2923e34c970c181163a7df4afa0ec4866302c4596f85c4d9bde2e48ff8784574314531dc7b3b53fd31210390a7ec9205eb515a85504049e79033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-elasticsearch-dsl \
python310-elasticsearch-dsl \
python3dist-elasticsearch-dsl"

RDEPENDS:${PN} += "python-abi \
python310-elasticsearch \
python310-python-dateutil"

inherit rpm
