SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "python311-swagger-spec-validator-3.0.3-1.5.noarch.rpm"
RPM_HASH = "f0070cb71ec028d12c365d5783b65d8ddbfd70d4427bee1e9b59083cfb8078d340112eb91c50494fb555cd15645946da5f77d4a730ebb41a05fb22ad183934bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swagger-spec-validator \
python3.11dist-swagger-spec-validator \
python311-swagger-spec-validator \
python3dist-swagger-spec-validator"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-jsonschema \
python311-typing-extensions"

inherit rpm
