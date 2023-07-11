SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-pytest-dependency-0.5.1-2.12.noarch.rpm"
RPM_HASH = "df88205983026577e6a2eb04b3fc3f1757473c411800c53585507e2a711108debdf62b4ba18452c208b92c2aa06fa487db5f8ac87a3b9d35c13eb1dc73b3c427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-dependency \
python310-pytest-dependency \
python3dist-pytest-dependency"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
