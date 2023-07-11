SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-openapi-schema-validator-0.4.4-2.3.noarch.rpm"
RPM_HASH = "03d6e2b70ccecb972bb9b18685844ac03793fa3ff1624d6d4a4539064f3c6c243a80d0b577153e846587c97e0730f41c6ea070eab7341374a58b09b00b2bd827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-schema-validator \
python3.11dist-openapi-schema-validator \
python311-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python311-jsonschema >= 4 with python311-jsonschema < 4.18 \
python-abi \
python311-rfc3339-validator"

inherit rpm
