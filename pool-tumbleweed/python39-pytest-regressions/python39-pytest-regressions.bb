SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-pytest-regressions-2.5.0-1.1.noarch.rpm"
RPM_HASH = "68959d8bf45def20eb0003100c4225dc2a28d881eb89e9342bfd0b0b6740e179623b46758fa5030501c0739751d64343244981c6aeeaec5577af4bf1685ea2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-regressions \
python39-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-pytest \
python39-pytest-datadir"

inherit rpm
