SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.6"

RPM_NAME = "python310-openapi-spec-validator-0.5.6-2.2.noarch.rpm"
RPM_HASH = "742d0d1cfe6edc102e250ec113b0a8ddeaf5a9c90991eac6031611b3d923fe8e6bf1c5b7187cb99d77cd42cfa6d8e7c8d1cd7221e1d2d83a3241090bcb8c6210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openapi-spec-validator \
python310-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.0.0 with python310-jsonschema < 4.18 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-importlib-resources \
python310-jsonschema-spec \
python310-lazy-object-proxy \
python310-openapi-schema-validator \
update-alternatives"

inherit rpm
