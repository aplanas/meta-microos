SUMMARY = "Client- and server-side support for the OpenAPI Specification v3"
DESCRIPTION = "Openapi-core is a Python library that adds client-side \
and server-side support for the OpenAPI Specification \
v3.0.0."
LICENSE = "BSD-3-Clause"

PV = "0.16.1"

RPM_NAME = "python39-openapi-core-0.16.1-1.3.noarch.rpm"
RPM_HASH = "d591fbb721da6f0c65c48dcd482168e695b7c7b861e5e2b93374ecf77189e2db89e3b90d7f20adba8d042f82bdeac2e40f299425b2dfbfabe21634c6b398458b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openapi-core) \
python39-openapi-core \
python3dist(openapi-core)"
RDEPENDS:${PN} += "python(abi) \
python39-Werkzeug \
python39-isodate \
python39-jsonschema-spec \
python39-more-itertools \
python39-openapi-schema-validator \
python39-openapi-spec-validator \
python39-parse \
python39-pathable \
python39-typing-extensions"

inherit rpm
