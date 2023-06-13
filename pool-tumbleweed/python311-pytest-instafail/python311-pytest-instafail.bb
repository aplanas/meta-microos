SUMMARY = "Pytest Plugin to Show Failures Instantly"
DESCRIPTION = "Pytest-instafail is a plugin for py.test that shows \
failures and errors instantly instead of waiting \
until the end of test session."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pytest-instafail-0.5.0-1.1.noarch.rpm"
RPM_HASH = "47681867487a28acafa09473a0a40bc01d945e513cfe941e417dbb4edf980502f9bfc0908a79eded698b2a78f0a81d74e76ef1745035f215859e23985db8407d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-instafail) \
python311-pytest-instafail \
python3dist(pytest-instafail)"

RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
