SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-pytest-services-2.2.1-2.6.noarch.rpm"
RPM_HASH = "9577a549c3f0dd1581d627eccaf584fb2d8c27196043d42b5e32aba543c26a30a0b432f161f3d27810d3ff221526d56ac14ec3632200eb08b12c534792f3b400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-services \
python3.10dist(pytest-services) \
python310-pytest-services \
python3dist(pytest-services)"

RDEPENDS:${PN} += "python(abi) \
python310-psutil \
python310-pytest \
python310-requests \
python310-setuptools \
python310-zc.lockfile"

inherit rpm
