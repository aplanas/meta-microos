SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python310-pytest-check-1.0.5-1.8.noarch.rpm"
RPM_HASH = "0fd8008113dbf2c01c8d3aad6ad0bea610f1c7f5402e0b98c0fb7851f50f066625d4e7c973bbdc981be9484494b2aca3abaca9f0f8477b45483eb2c027e8a85d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check \
python3.10dist-pytest-check \
python310-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
