SUMMARY = "OpenAPI schema validator for Python"
DESCRIPTION = "Openapi-schema-validator is a Python library that validates \
schema against the OpenAPI Schema Specification v3.0 which \
is an extended subset of the JSON Schema Specification \
Wright Draft 00."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-openapi-schema-validator-0.4.4-2.3.noarch.rpm"
RPM_HASH = "17efd00a7708f339f252534fed8042fba3970377e7d786fdfe9d0fb82f39b6ac09fd34e68a0509b262c4a867471361657927bb5d37d9b281bac9decc261ecdf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-schema-validator \
python39-openapi-schema-validator \
python3dist-openapi-schema-validator"

RDEPENDS:${PN} += "-python39-jsonschema >= 4 with python39-jsonschema < 4.18 \
python-abi \
python39-rfc3339-validator"

inherit rpm
