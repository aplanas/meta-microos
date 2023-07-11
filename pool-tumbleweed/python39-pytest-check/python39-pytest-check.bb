SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python39-pytest-check-1.0.5-1.10.noarch.rpm"
RPM_HASH = "bb1977c2bced02939c36d282b510d12eed4fdb271dd3d2c57a193aee17bc5342c611e27a8447edbccd929b699643aeded97619aa100814cadfda32a3f95f84a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-check \
python39-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
