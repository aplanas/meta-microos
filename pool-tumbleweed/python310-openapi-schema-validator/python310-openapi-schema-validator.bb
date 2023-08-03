SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-openapi-schema-validator-0.6.0-2.1.noarch.rpm"
RPM_HASH = "7d3d6698c590295f12d26422e9815151a80316271116e338f36914865d2abcdb23527a650a46458175a7e83b77f2060fe05a52f275e54ba5ce8f00935afc4260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openapi-schema-validator \
python310-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.18 with python310-jsonschema < 5 \
python-abi \
python310-jsonschema-specifications \
python310-rfc3339-validator"

inherit rpm
