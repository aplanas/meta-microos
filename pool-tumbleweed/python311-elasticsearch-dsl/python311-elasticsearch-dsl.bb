SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python311-elasticsearch-dsl-8.9.0-1.1.noarch.rpm"
RPM_HASH = "d7c26e6a081ae8e3c78d37bb02f0a6c79e012ca77030c0a10bae73e38c16418badd4ee545d197fff4e14e0db1aa95dee4641218780dec4eb66219e4c4f269e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-elasticsearch-dsl \
python3.11dist-elasticsearch-dsl \
python311-elasticsearch-dsl \
python3dist-elasticsearch-dsl"

RDEPENDS:${PN} += "python-abi \
python311-elasticsearch \
python311-python-dateutil"

inherit rpm
