SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-pytest-dependency-0.5.1-2.12.noarch.rpm"
RPM_HASH = "f635d19584648994ea73aaec28abeb3e692a4788b8a717edf17f4b7fd8b81948e75b744ed430bc8fb2313f2ab4ca69c892430cad388a56ae91b982f24d43c0bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-dependency \
python3.11dist-pytest-dependency \
python311-pytest-dependency \
python3dist-pytest-dependency"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
