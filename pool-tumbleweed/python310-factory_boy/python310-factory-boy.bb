SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python310-factory_boy-3.2.1-3.1.noarch.rpm"
RPM_HASH = "ce2b1b47ab41141577ed0cb4588af57f78859d314d16fdfdb17347a7db643406f05ecbb7b3cdbb6ea6dea9d1ae1f13afd59a557e53ea33f6e7a92d5ac3c6dce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-factory_boy \
python3.10dist(factory-boy) \
python310-factory_boy \
python3dist(factory-boy)"

RDEPENDS:${PN} += "python(abi) \
python310-Faker"

inherit rpm
