SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-pytest-error-for-skips-2.0.2-1.16.noarch.rpm"
RPM_HASH = "4fab89392b4b179d04b8c2bbd29a5144b26ab7ed0c81550b9315a0ac01388ef28642806c01cb4bf1055516214c47fab79446d839e6c4c886d754bdcabfb15bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-error-for-skips \
python310-pytest-error-for-skips \
python3dist-pytest-error-for-skips"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
