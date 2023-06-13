SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-pytest-error-for-skips-2.0.2-1.14.noarch.rpm"
RPM_HASH = "3d487a2cc22e0ddf8492152012dd6ea0002073e0253010425b7cefc2fe1d3c34a3c6937b5b406a221fb764e189b4651a1cc29c7eb217995ff5b589600c89e246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-error-for-skips \
python3.10dist(pytest-error-for-skips) \
python310-pytest-error-for-skips \
python3dist(pytest-error-for-skips)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
