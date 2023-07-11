SUMMARY = "Mocking/stub framework for Python"
DESCRIPTION = "Chai provides an API for mocking/stubbing Python \
objects, patterned after the Mocha library for Ruby."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "python310-chai-1.1.2-6.2.noarch.rpm"
RPM_HASH = "62fa9618897f83eb4bcfc893c6405d84ae750aa73b024ba784a20b1c1dbf3de4910e2284f4a7789f541838e5396b6a876ff70c0b3cb542d1025929bddce64d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-chai \
python310-chai \
python3dist-chai"

RDEPENDS:${PN} += "python-abi"

inherit rpm
