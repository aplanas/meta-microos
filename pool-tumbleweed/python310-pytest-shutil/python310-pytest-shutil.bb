SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-shutil-1.7.0-7.3.noarch.rpm"
RPM_HASH = "44ffeb6d69e93cbb03034bc71601b778dd00809b8fe5a9a1d051fbad59e52c0fc50a06fc009ca437440fac8ec5e1c7030fa1653dbb3a62b19c57d873b48cd633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-shutil \
python310-pytest-shutil \
python3dist-pytest-shutil"

RDEPENDS:${PN} += "python-abi \
python310-execnet \
python310-path \
python310-pytest \
python310-six \
python310-termcolor"

inherit rpm
