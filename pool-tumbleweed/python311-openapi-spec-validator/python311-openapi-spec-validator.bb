SUMMARY = "Python module for validating OpenAPI Specs against Swagger and OAS3"
DESCRIPTION = "OpenAPI Spec Validator is a Python library that validates \
OpenAPI Specs against the OpenAPI 2.0 (aka Swagger) and \
OpenAPI 3.0.0 specification. The validator aims to check \
for full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python311-openapi-spec-validator-0.6.0-2.1.noarch.rpm"
RPM_HASH = "ec06f9299a1214c47fa434e71e647050c1e7a76f184bdec0d02e2618ade8621d44df038f857675c369adb4e35e1a6dbd14b6a2e348264c11a9e6474a7282c9b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openapi-spec-validator \
python3.11dist-openapi-spec-validator \
python311-openapi-spec-validator \
python3dist-openapi-spec-validator"

RDEPENDS:${PN} += "-python311-jsonschema >= 4.18 with python311-jsonschema < 5 \
-python311-jsonschema-spec >= 0.2.3 with python311-jsonschema-spec < 0.3 \
-python311-lazy-object-proxy >= 1.7.1 with python311-lazy-object-proxy < 2 \
-python311-openapi-schema-validator >= 0.6.0 with python311-openapi-schema-validator < 0.7 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
