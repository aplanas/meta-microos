SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-pdm-pep517-1.1.2-2.3.noarch.rpm"
RPM_HASH = "9478634ee0de1b2e6b2f948e2adcb4df557116d9d56c56dead70c7413b65bbd9f21bfe0ea760f981e9148b0648f7ffa3dcbdba07f88f626cb74131ca31e18741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pdm-pep517 \
python310-pdm-pep517 \
python3dist-pdm-pep517"

RDEPENDS:${PN} += "python-abi"

inherit rpm
