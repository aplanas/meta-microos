SUMMARY = "Mocking/stub framework for Python"
DESCRIPTION = "Chai provides an API for mocking/stubbing Python \
objects, patterned after the Mocha library for Ruby."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "python310-chai-1.1.2-6.1.noarch.rpm"
RPM_HASH = "69bfaa7c3f6ad8f42ba65cada7ffae8bc4b41709ae038def9234d55a3fe6d3286fc5fffcfc617967c3d9aa80863d4621ce8addd7092edf158f915fafeec70a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chai \
python3.10dist(chai) \
python310-chai \
python3dist(chai)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
