SUMMARY = "Mocking/stub framework for Python"
DESCRIPTION = "Chai provides an API for mocking/stubbing Python \
objects, patterned after the Mocha library for Ruby."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "python39-chai-1.1.2-6.1.noarch.rpm"
RPM_HASH = "a19833b67bd389894590d3db4eb20d312d40e961ffb04f2d0937b2159f0506d7a3350e97466fcf2fd09cee22f675f0b2c8288579036b35989a86fd059819eefe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-chai \
python39-chai \
python3dist-chai"

RDEPENDS:${PN} += "python-abi"

inherit rpm
