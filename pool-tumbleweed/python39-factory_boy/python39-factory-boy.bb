SUMMARY = "Python test fixtures"
DESCRIPTION = "A test fixtures replacement based on thoughtbot's factory_girl for Ruby."
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python39-factory_boy-3.2.1-3.3.noarch.rpm"
RPM_HASH = "85243764fce043c926cf542cd2fc9bdabc162095073e1ffd21327a1da71eb2997b6d2c6e2f67cdb5e0ac431d5e1131aab3b654a15e012bb4723d9b92cae0fe9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-factory-boy \
python39-factory-boy \
python3dist-factory-boy"

RDEPENDS:${PN} += "python-abi \
python39-Faker"

inherit rpm
