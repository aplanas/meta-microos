SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python311-factory_boy-3.2.1-3.1.noarch.rpm"
RPM_HASH = "83a2a3a1f474ab6a6a713021ba24740dc308394ba18a2e0aeeaf9f1254cadd8c7b622a156b023f94a55432c9720636080884a3436b3b373a8dcca56c633e439f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-factory-boy \
python311-factory-boy \
python3dist-factory-boy"

RDEPENDS:${PN} += "python-abi \
python311-Faker"

inherit rpm
