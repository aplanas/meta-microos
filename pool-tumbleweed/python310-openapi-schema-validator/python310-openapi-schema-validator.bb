SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-openapi-schema-validator-0.4.4-2.3.noarch.rpm"
RPM_HASH = "226f34a1cb19c06b1c389010758445a3e40108d51cd3a50e5cf8f786e5aba38231728324cf25db01da47b8e568a52cdd2b0aa5135548675fb18879181edc2386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openapi-schema-validator \
python310-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python310-jsonschema >= 4 with python310-jsonschema < 4.18 \
python-abi \
python310-rfc3339-validator"

inherit rpm
