SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 2 and 3."
LICENSE = "BSD-3-Clause"

PV = "0.1.28"

RPM_NAME = "python39-PyScreeze-0.1.28-1.3.noarch.rpm"
RPM_HASH = "692f093648bd267cee6e903465d1df75b044cee0208f981580d14f1fc3188eb62af5e1397a8a0e74708fbcc081067e79802548f5fd2674585d8059f3d32c74ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyscreeze \
python39-PyScreeze \
python3dist-pyscreeze"

RDEPENDS:${PN} += "python-abi \
python39-Pillow"

inherit rpm
