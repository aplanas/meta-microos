SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-pytest-services-2.2.1-3.3.noarch.rpm"
RPM_HASH = "4ca124374c88f2c95d5184c076af63fbd116cd188599451109e84c0867ce2ac0bdeceb18d105ddee222265952872eb3912610e00eac5edb1e9e0fc80788d5885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-services \
python310-pytest-services \
python3dist-pytest-services"

RDEPENDS:${PN} += "python-abi \
python310-psutil \
python310-pytest \
python310-requests \
python310-setuptools \
python310-zc.lockfile"

inherit rpm
