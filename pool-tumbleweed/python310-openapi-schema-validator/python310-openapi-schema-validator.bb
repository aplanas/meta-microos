SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-openapi-schema-validator-0.4.4-1.1.noarch.rpm"
RPM_HASH = "330e13ff14012ad1456e4da1d53ee7543275417687162157aa89024d3dceb3625a90989abf1a9c947804839a3f6e4e2dfc00ada1055494d8ce8ba63fd1269d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-schema-validator \
python3.10dist-openapi-schema-validator \
python310-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python310-jsonschema >= 4 with python310-jsonschema < 4.18 \
python-abi \
python310-rfc3339-validator"

inherit rpm
