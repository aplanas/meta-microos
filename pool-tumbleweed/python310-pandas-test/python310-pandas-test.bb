SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-test-2.1.0-1.2.noarch.rpm"
RPM_HASH = "99eed2dbe8b00d754130e9d0b0efa54b2d1964a9ca10e18f3706cec54fa9d530232dfdb4e76984b0245ae7a36b4c5adee04527f8713411266820bbc98f50742c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-test"

RDEPENDS:${PN} += "python310-hypothesis \
python310-pandas \
python310-pytest \
python310-pytest-asyncio \
python310-pytest-xdist"

inherit rpm
