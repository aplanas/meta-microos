SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-pytest-error-for-skips-2.0.2-1.14.noarch.rpm"
RPM_HASH = "b3b712cb29d0a7934f4e7306cf96df2fd794d79977ac99d94e1641ae1d17d2fa912f0ef536c9b8031093f7d5553b0a92df631403c9bed66ff02c4475758c1132"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-error-for-skips \
python39-pytest-error-for-skips \
python3dist-pytest-error-for-skips"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
