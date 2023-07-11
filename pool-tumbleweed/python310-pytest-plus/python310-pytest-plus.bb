SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-pytest-plus-0.4.0-1.3.noarch.rpm"
RPM_HASH = "6475d8f5473bd56422f7bbefe7e691aa1f7e1ab47f9920d6fad50652a2b48c4424cccab9798e2a0ec2301d92928d78f051a853c2663e97a616b49538833e9030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-plus \
python310-pytest-plus \
python3dist-pytest-plus"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
