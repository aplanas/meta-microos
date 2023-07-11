SUMMARY = "Plugin core for use by pytest-cov, nose-cov and nose2-cov"
DESCRIPTION = "This is a lib package for use by pytest-cov, nose-cov and nose2-cov.  Unless your developing a \
coverage plugin for a test framework then you probably want one of those."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python311-cov-core-1.15.0-4.16.noarch.rpm"
RPM_HASH = "9b43c41cc8314d726c17cd8f056546ccd0d266aa4760db3f528ebf6fb071d463ca9af5febd3cccad691b2681b75a6b54a4d8001d638f5d983736e54dea4ad6a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cov-core \
python3.11dist-cov-core \
python311-cov-core \
python3dist-cov-core"

RDEPENDS:${PN} += "python-abi \
python311-coverage"

inherit rpm
