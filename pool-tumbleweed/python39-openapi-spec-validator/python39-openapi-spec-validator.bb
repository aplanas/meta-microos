SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.5.6"

RPM_NAME = "python39-openapi-spec-validator-0.5.6-2.2.noarch.rpm"
RPM_HASH = "f1ed0d6fbf13fa5b42c347f64085328ba11fc9a15ab5349f895fca668c073d8640ddd0eaba80bf855a9640b2e92c741f41e14754db6920e780af853b7b971689"
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
