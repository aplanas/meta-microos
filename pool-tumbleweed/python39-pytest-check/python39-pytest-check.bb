SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-pytest-check-2.2.0-1.1.noarch.rpm"
RPM_HASH = "6842774715694d373c511e371ef76cff9b5138845aa4c57bbe1c7e009c5a678324ad81d04e38edec6d94ded15f04d77e3c1026000895cc610e9c1db13acecb87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-check \
python39-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
