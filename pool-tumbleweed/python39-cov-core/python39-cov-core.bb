SUMMARY = "Plugin core for use by pytest-cov, nose-cov and nose2-cov"
DESCRIPTION = "This is a lib package for use by pytest-cov, nose-cov and nose2-cov.  Unless your developing a \
coverage plugin for a test framework then you probably want one of those."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python39-cov-core-1.15.0-4.16.noarch.rpm"
RPM_HASH = "542b292031890ad7bb8004c4ae935812c70f7a0095e1ad7aca7b298d8f925211ed4a11e10416282e92dd326c63817253bf6fbadd44b533d7fd443acb4937d618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cov-core \
python39-cov-core \
python3dist-cov-core"

RDEPENDS:${PN} += "python-abi \
python39-coverage"

inherit rpm
