SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "python311-pytest-regressions-2.4.2-3.3.noarch.rpm"
RPM_HASH = "252f743d74a7ec7168d58d2f3d02b11d3877d8f3a46ae53f91e1918b0206ef4a8cf424af3df09db2e572fab21212073bcfaa6bf45f765f3a318099103a3481dc"
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
