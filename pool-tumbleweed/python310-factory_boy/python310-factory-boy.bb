SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python310-factory_boy-3.2.1-3.3.noarch.rpm"
RPM_HASH = "66e03b77c3a7607557364a3d42e158a29b79d6631c91b23cc9aa4af12c38e4d1397e0cb3a4714a4793cdbadbd807286b2392ef131648b2a60ba7f13d4774876a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-factory-boy \
python310-factory-boy \
python3dist-factory-boy"

RDEPENDS:${PN} += "python-abi \
python310-Faker"

inherit rpm
