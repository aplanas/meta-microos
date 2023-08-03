SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python310-openapi-spec-validator-0.6.0-2.1.noarch.rpm"
RPM_HASH = "c2d50d81e63f35062e1bc5e48f53bbbebcf4a5f64bd680cc1ae183fce8e73aa7849fc30b5db7de847f93995e6dd380cd9de99e4fcd86225457607952636f23ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openapi-spec-validator \
python310-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.18 with python310-jsonschema < 5 \
-python310-jsonschema-spec >= 0.2.3 with python310-jsonschema-spec < 0.3 \
-python310-lazy-object-proxy >= 1.7.1 with python310-lazy-object-proxy < 2 \
-python310-openapi-schema-validator >= 0.6.0 with python310-openapi-schema-validator < 0.7 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
