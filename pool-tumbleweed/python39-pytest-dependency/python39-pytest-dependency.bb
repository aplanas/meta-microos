SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-pytest-dependency-0.5.1-2.12.noarch.rpm"
RPM_HASH = "135b36615da84d95880e3f7ee28bcec7cc4da335ee734ac1258e5c3053051e362b4b2d01c2291d8ad61d8bace44d7970326baf7810732e8d62ac2dce121aae3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-dependency \
python39-pytest-dependency \
python3dist-pytest-dependency"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
