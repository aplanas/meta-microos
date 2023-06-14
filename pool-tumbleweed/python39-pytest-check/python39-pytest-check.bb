SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python39-pytest-check-1.0.5-1.8.noarch.rpm"
RPM_HASH = "3f73b6873a0d133f48e938c7299c5c93555d940c840b6204ef7b3ef9be54ad899d35c9d66ef182d44178b849b26364d92d01b2d67af4b2822b6d91b46c95b4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-check \
python39-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
