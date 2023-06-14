SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-openapi-schema-validator-0.4.4-1.1.noarch.rpm"
RPM_HASH = "156500351409e777fcd138b0116260aef59d948530680ef791ad528f1c208255d33c0b3841a127e3b68896726bdb6d2f88381e35ddc1460ee3d723a13994fe65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-schema-validator \
python39-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python39-jsonschema >= 4 with python39-jsonschema < 4.18 \
python-abi \
python39-rfc3339-validator"

inherit rpm
