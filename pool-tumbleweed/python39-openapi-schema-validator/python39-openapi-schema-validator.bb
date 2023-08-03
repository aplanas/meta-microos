SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-openapi-schema-validator-0.6.0-2.1.noarch.rpm"
RPM_HASH = "4d170c0147c0170d66228ad87c37c38895ab37c5f6c945de96f9f1138aa1ef981a3d7295d03ac30ad16adae0152bfc10d377aa2304b514fa38d22e2bc63a9104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-schema-validator \
python39-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python39-jsonschema >= 4.18 with python39-jsonschema < 5 \
python-abi \
python39-jsonschema-specifications \
python39-rfc3339-validator"

inherit rpm
