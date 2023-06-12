SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.16.1"

RPM_NAME = "python310-openapi-core-0.16.1-1.3.noarch.rpm"
RPM_HASH = "c05df3fd7d5f56c72743672d0f212f0c2729ae319144b6511f9d0d5ed9c63241abac69ab1bc0dd5fc76e64c0b1ce9935e528c416c610025c3a2205c0d5d13a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-core \
python3.10dist(openapi-core) \
python310-openapi-core \
python3dist(openapi-core)"
RDEPENDS:${PN} += "python(abi) \
python310-Werkzeug \
python310-isodate \
python310-jsonschema-spec \
python310-more-itertools \
python310-openapi-schema-validator \
python310-openapi-spec-validator \
python310-parse \
python310-pathable \
python310-typing-extensions"

inherit rpm
