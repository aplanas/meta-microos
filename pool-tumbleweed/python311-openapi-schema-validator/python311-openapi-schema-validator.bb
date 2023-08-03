SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-openapi-schema-validator-0.6.0-2.1.noarch.rpm"
RPM_HASH = "40bfa6f21662dd8c7a30442a1529505d23a8f84684f31fd7873926ab86d9e1d9e34149a0ea630abab7b5bc82205f5248b80aa708656f2ab4b12334466275dd69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-schema-validator \
python3.11dist-openapi-schema-validator \
python311-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python311-jsonschema >= 4.18 with python311-jsonschema < 5 \
python-abi \
python311-jsonschema-specifications \
python311-rfc3339-validator"

inherit rpm
