SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.6"

RPM_NAME = "python310-openapi-spec-validator-0.5.6-1.1.noarch.rpm"
RPM_HASH = "24ef9cc32d199219cb9a828304d41d1b7dbc8115f9d45d45c2d1e24605fe3b7aee45efcb8b3fd407c44cc704f68d5c9661360a489bf3a2c5bfc7ddaee5242178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-spec-validator \
python3.10dist-openapi-spec-validator \
python310-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.0.0 with python310-jsonschema < 4.18 \
/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-importlib-resources \
python310-jsonschema-spec \
python310-lazy-object-proxy \
python310-openapi-schema-validator \
update-alternatives"

inherit rpm
