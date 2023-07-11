SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "python39-pytest-regressions-2.4.2-3.3.noarch.rpm"
RPM_HASH = "a52cef57e1ab95b78bca31e4ceab7b9d08b205a1554a589af2dd953b380ec2b13b80e5aea342a5df4a357cada945bc7b0e163910b882c38b97ee19a131de1bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-regressions \
python39-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-pytest \
python39-pytest-datadir"

inherit rpm
