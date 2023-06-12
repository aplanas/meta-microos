SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "python39-pytest-regressions-2.4.2-3.1.noarch.rpm"
RPM_HASH = "caa0c72677a2b158fc4664f4665568d06baa830a63eca7a629595f14f1c127fc13d68706307847a26f4650c733c45f4873937cc9bc51dbbd344d8fcd3548e589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-regressions) \
python39-pytest-regressions \
python3dist(pytest-regressions)"
RDEPENDS:${PN} += "python(abi) \
python39-PyYAML \
python39-pytest \
python39-pytest-datadir"

inherit rpm
