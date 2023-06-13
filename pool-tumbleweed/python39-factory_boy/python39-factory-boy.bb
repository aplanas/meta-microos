SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python39-factory_boy-3.2.1-3.1.noarch.rpm"
RPM_HASH = "d54d7cbea18909e577e3de842dc34a949be7c2f1296365500d79aeee85ae18ae4b723d82fe0b4e969abf2b496f2d5319143d4fd201335265ff909a55c868e9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(factory-boy) \
python39-factory_boy \
python3dist(factory-boy)"

RDEPENDS:${PN} += "python(abi) \
python39-Faker"

inherit rpm
