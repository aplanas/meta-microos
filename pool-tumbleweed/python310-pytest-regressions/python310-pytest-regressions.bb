SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python310-pytest-regressions-2.5.0-1.1.noarch.rpm"
RPM_HASH = "89779c248598d54a56f71a41338025e199a09679f0e9c6490ccfaeae76ccfae64430859720e24932653e9f7eb425a6183c9ceba6c14a525074dc9d54296c7ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-regressions \
python310-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-pytest \
python310-pytest-datadir"

inherit rpm
