SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-pytest-dependency-0.5.1-2.10.noarch.rpm"
RPM_HASH = "3492db74b9960ff5da5725583757dcbc9e8a41c14bc601736d61520af9ca1751ca62f70bb0d9869244f7ae57dbca712692806ff29babaca2cfb66a39818a4395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-dependency \
python311-pytest-dependency \
python3dist-pytest-dependency"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
