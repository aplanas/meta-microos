SUMMARY = "Mocking/stub framework for Python"
DESCRIPTION = "Chai provides an API for mocking/stubbing Python \
objects, patterned after the Mocha library for Ruby."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "python311-chai-1.1.2-6.1.noarch.rpm"
RPM_HASH = "71bf21317f65aa02b181f95b58eb3afab5dc2e7d8d4b2e4c8ddc3750e9d7048e3557e1637e79f98039053f137c36fcedd7943b2a3a7bf8489b24d509ba963ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-chai \
python311-chai \
python3dist-chai"

RDEPENDS:${PN} += "python-abi"

inherit rpm
