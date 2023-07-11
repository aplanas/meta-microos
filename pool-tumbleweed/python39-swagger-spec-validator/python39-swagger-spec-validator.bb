SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "python39-swagger-spec-validator-3.0.3-1.5.noarch.rpm"
RPM_HASH = "e8d866382e0d369b732307fae6e85da3667acb040c5ec15793714cc7f55e4427cb01d769e913c72c96db0b2db45ed01085a5ab60c42a006f1b845b207ffff55d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-swagger-spec-validator \
python39-swagger-spec-validator \
python3dist-swagger-spec-validator"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-jsonschema \
python39-typing-extensions"

inherit rpm
