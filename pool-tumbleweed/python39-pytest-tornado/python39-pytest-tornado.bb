SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python39-pytest-tornado-0.8.1-1.12.noarch.rpm"
RPM_HASH = "8bb77b2ac7f723fce5d39983659ffbec1b80a33da6799a27792ef7530dae6443a5881c5e5d753c63568f03ac189803388968fcc38b072f7f26940ba0fee52e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-tornado) \
python39-pytest-tornado \
python3dist(pytest-tornado)"
RDEPENDS:${PN} += "python(abi) \
python39-certifi \
python39-pytest \
python39-tornado"

inherit rpm
