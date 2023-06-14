SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-pytest-subtests-0.11.0-1.1.noarch.rpm"
RPM_HASH = "b7c92ba8020f690361bfbf10d3e5ac98590ee3024f2ccc69f3fdb5a1b5caa1532e6e8cef3ce1c8a7979f51b3b57f25b91278ef0fb4e1927fe760591e05149180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-subtests \
python311-pytest-subtests \
python3dist-pytest-subtests"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
