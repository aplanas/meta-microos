SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python39-openapi-spec-validator-0.6.0-2.1.noarch.rpm"
RPM_HASH = "7603456a29d45c943a02b52424aba03460ab8d872b541dc2c1b7ae842dc747d564427d3162c5b7d9ae1095b30db475938946ea95531062bbc5a2db4c045eac1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openapi-spec-validator \
python39-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python39-jsonschema >= 4.18 with python39-jsonschema < 5 \
-python39-jsonschema-spec >= 0.2.3 with python39-jsonschema-spec < 0.3 \
-python39-lazy-object-proxy >= 1.7.1 with python39-lazy-object-proxy < 2 \
-python39-openapi-schema-validator >= 0.6.0 with python39-openapi-schema-validator < 0.7 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
