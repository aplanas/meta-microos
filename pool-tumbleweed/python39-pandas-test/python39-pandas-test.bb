SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-test-2.0.3-1.2.noarch.rpm"
RPM_HASH = "ebbfa85fc3413d400d93382a8710f0e86917a445665b514beefc7ff714c30481071fcf995ca41ae587479183b73cce05591d32c61f7b5942c3f449553ac19841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-test"

RDEPENDS:${PN} += "python39-hypothesis \
python39-pandas \
python39-pytest \
python39-pytest-asyncio \
python39-pytest-xdist"

inherit rpm
