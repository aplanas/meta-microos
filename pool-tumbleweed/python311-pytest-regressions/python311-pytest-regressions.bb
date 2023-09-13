SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-pytest-regressions-2.5.0-1.1.noarch.rpm"
RPM_HASH = "80489e9e07eb8b11329b383aea4b7500d80fbf93a83127f40b39ca5875def068309694e7020effd11b0a9f346ec43af0a285937b6651b04f8d9b1d71c9c3ddb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-regressions \
python3.11dist-pytest-regressions \
python311-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-pytest \
python311-pytest-datadir"

inherit rpm
