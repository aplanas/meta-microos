SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.6"

RPM_NAME = "python311-openapi-spec-validator-0.5.6-2.2.noarch.rpm"
RPM_HASH = "9c0af276491bc6adf310441ab108b2692a930e3148f923b541eda2ad804292f8cde3d8f330132c73845837334f8373d756719cb168d5a96daf7ca6fa1eb7c3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-spec-validator \
python3.11dist-openapi-spec-validator \
python311-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python311-jsonschema >= 4.0.0 with python311-jsonschema < 4.18 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-importlib-resources \
python311-jsonschema-spec \
python311-lazy-object-proxy \
python311-openapi-schema-validator \
update-alternatives"

inherit rpm
