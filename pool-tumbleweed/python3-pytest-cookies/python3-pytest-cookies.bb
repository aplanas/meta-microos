SUMMARY = "Cookiecutter template pytest plugin"
DESCRIPTION = "The pytest plugin for your Cookiecutter templates."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python3-pytest-cookies-0.7.0-2.1.noarch.rpm"
RPM_HASH = "0f870f566a0921f2b8cc3d9973d0db955930c8d27c4efbcc17ef86f2a02367e0c4f160873d085ae5db482d1104a7c9a049a0a1c6c57e39648d1f7d39f9cc1594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cookies \
python3.11dist-pytest-cookies \
python3dist-pytest-cookies"

RDEPENDS:${PN} += "cookiecutter \
python-abi \
python3-pytest"

inherit rpm
