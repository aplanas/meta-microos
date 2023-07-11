SUMMARY = "Mocking/stub framework for Python"
DESCRIPTION = "Chai provides an API for mocking/stubbing Python \
objects, patterned after the Mocha library for Ruby."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "python311-chai-1.1.2-6.2.noarch.rpm"
RPM_HASH = "ede4ed10c2842b799db191f34cd2339f71ec80ddd38cd78337d5112a144f776a35132ff72955ba122cbc58d1ea5ff2f01170118319ba97a28bca530794ab2d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chai \
python3.11dist-chai \
python311-chai \
python3dist-chai"

RDEPENDS:${PN} += "python-abi"

inherit rpm
