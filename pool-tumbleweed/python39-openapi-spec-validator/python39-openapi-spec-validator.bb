SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.6"

RPM_NAME = "python39-openapi-spec-validator-0.5.6-1.1.noarch.rpm"
RPM_HASH = "0f276e952a8f19b20a5ad2fbb90e0f61c46d3ff256d4200d844f9f5140aec04047867bda687bafab365c81e47bcea7363bb343ffbd5931e7bab5e904057afd8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-spec-validator \
python39-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python39-jsonschema >= 4.0.0 with python39-jsonschema < 4.18 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-importlib-resources \
python39-jsonschema-spec \
python39-lazy-object-proxy \
python39-openapi-schema-validator \
update-alternatives"

inherit rpm
