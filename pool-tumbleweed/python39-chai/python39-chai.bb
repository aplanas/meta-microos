SUMMARY = "Mocking/stub framework for Python"
DESCRIPTION = "Chai provides an API for mocking/stubbing Python \
objects, patterned after the Mocha library for Ruby."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "python39-chai-1.1.2-6.2.noarch.rpm"
RPM_HASH = "83da4a84f42d2efad9405178b0b63057d2a55065e386aa6c4d805a9a4a64c04af7024e21796872ca1dd3525e408b8f4c24a4432c8bd142b754ce354f6500d9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-chai \
python39-chai \
python3dist-chai"

RDEPENDS:${PN} += "python-abi"

inherit rpm
