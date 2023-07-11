SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python311-factory_boy-3.2.1-3.3.noarch.rpm"
RPM_HASH = "9fe05cbd56232ec759d63e11bd2042a29f204a29738279ad237fc0c73872dd40da93ad5fe4b5aebaf762ee09074dc5222b9602063510f4ed0413469b254d70a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-factory-boy \
python3.11dist-factory-boy \
python311-factory-boy \
python3dist-factory-boy"

RDEPENDS:${PN} += "python-abi \
python311-Faker"

inherit rpm
