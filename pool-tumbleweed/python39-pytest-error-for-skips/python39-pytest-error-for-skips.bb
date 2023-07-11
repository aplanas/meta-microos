SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-pytest-error-for-skips-2.0.2-1.16.noarch.rpm"
RPM_HASH = "9c8fe674724cdb45b50a7529775ce4ba460e40d5815fce74586641ac41c32d6d92b6833c867230324c69d164356f87d428e53c11457db0d3bf8da1965818f6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-error-for-skips \
python39-pytest-error-for-skips \
python3dist-pytest-error-for-skips"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
