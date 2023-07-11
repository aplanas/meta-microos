SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-pytest-error-for-skips-2.0.2-1.16.noarch.rpm"
RPM_HASH = "3ae0873ea9e782df0b7ecb096d7c4f6fd88335476abd7656614f2310bdbe4c89428d1f8a48f9c7544e06a6a2ed775b23fc40e19422382e2a877fa5c3bdac29d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-error-for-skips \
python3.11dist-pytest-error-for-skips \
python311-pytest-error-for-skips \
python3dist-pytest-error-for-skips"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
