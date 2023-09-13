SUMMARY = "Python client for Elasticsearch"
DESCRIPTION = "Python client for Elasticsearch."
LICENSE = "Apache-2.0"

PV = "8.9.0"

RPM_NAME = "python39-elasticsearch-dsl-8.9.0-1.1.noarch.rpm"
RPM_HASH = "fa174cf263f715fe0191f4153442c621c92c091e51a22c4d713e7e0f97f033b14732c427bf12c71b42ece32ee290532085808dfa7954a38d39c84588e306844a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-elasticsearch-dsl \
python39-elasticsearch-dsl \
python3dist-elasticsearch-dsl"

RDEPENDS:${PN} += "python-abi \
python39-elasticsearch \
python39-python-dateutil"

inherit rpm
