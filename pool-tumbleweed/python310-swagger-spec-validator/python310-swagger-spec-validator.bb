SUMMARY = "Validation of Swagger specifications"
DESCRIPTION = "Swagger Spec Validator is a Python library that validates Swagger Specs against \
the Swagger 1.2 or Swagger 2.0 specification. The validator aims to check for \
full compliance with the Specification."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "python310-swagger-spec-validator-3.0.3-1.5.noarch.rpm"
RPM_HASH = "43ec10abd2956a0a46ae6e47455921d0e8621e4d7440659aa3446ffea4d6032a4c622e12eb5f5e061676be5b37af8a8b7cea6685bd2178d7fa6c2fe054930d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-swagger-spec-validator \
python310-swagger-spec-validator \
python3dist-swagger-spec-validator"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-jsonschema \
python310-typing-extensions"

inherit rpm
