SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python311-pytest-services-2.2.1-3.3.noarch.rpm"
RPM_HASH = "aa6c271d9e0ba28feeac319863264f1377502d1924ce16051dc176e8a62f5cc6ea34e9cb0f0fc02d1f24883db0d0235c8705d688b39d0338a47690420c7c77be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-services \
python3.11dist-pytest-services \
python311-pytest-services \
python3dist-pytest-services"

RDEPENDS:${PN} += "python-abi \
python311-psutil \
python311-pytest \
python311-requests \
python311-setuptools \
python311-zc.lockfile"

inherit rpm
