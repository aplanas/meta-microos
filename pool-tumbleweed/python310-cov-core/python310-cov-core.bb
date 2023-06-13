SUMMARY = "Plugin core for use by pytest-cov, nose-cov and nose2-cov"
DESCRIPTION = "This is a lib package for use by pytest-cov, nose-cov and nose2-cov.  Unless your developing a \
coverage plugin for a test framework then you probably want one of those."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python310-cov-core-1.15.0-4.14.noarch.rpm"
RPM_HASH = "622c6a97a47dc6ed2482e44db611bcf62e3cdb0dc62499c4538b417153909457241905760c81a3e748e4e0b70ca543df4adbd59d2c512b6f27cf8ff8e5dfbab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cov-core \
python3.10dist(cov-core) \
python310-cov-core \
python3dist(cov-core)"

RDEPENDS:${PN} += "python(abi) \
python310-coverage"

inherit rpm
