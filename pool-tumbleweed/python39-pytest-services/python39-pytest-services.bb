SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python39-pytest-services-2.2.1-3.3.noarch.rpm"
RPM_HASH = "e3534305b3185978e4c950c3f3238a0a535e027928e53c111661eb6a7e5426b618fa084f234682af2e665267468597a814df5fa2d9b58e2d0cc1e2c43eaa796b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-services \
python39-pytest-services \
python3dist-pytest-services"

RDEPENDS:${PN} += "python-abi \
python39-psutil \
python39-pytest \
python39-requests \
python39-setuptools \
python39-zc.lockfile"

inherit rpm
