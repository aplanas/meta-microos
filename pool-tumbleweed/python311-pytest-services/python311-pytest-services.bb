SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python311-pytest-services-2.2.1-2.6.noarch.rpm"
RPM_HASH = "d707bcdf55859c82c2dd6ba6e94b74918d94864fbc66f216588f9626b9d5386fc426055d6868a48f6e700dbf8251d4fdc48bbf5693c64a5092ec1f8816642833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-services) \
python311-pytest-services \
python3dist(pytest-services)"
RDEPENDS:${PN} += "python(abi) \
python311-psutil \
python311-pytest \
python311-requests \
python311-setuptools \
python311-zc.lockfile"

inherit rpm
