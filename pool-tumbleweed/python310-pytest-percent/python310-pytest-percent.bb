SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-pytest-percent-0.1.2-1.14.noarch.rpm"
RPM_HASH = "a4e91422576ce92246e546a5361e354e36afb071ff48ed18220ccf99ca8fd5b2071db328822d7372e042752b5570f1287ad248ef13e3c11b751c795a4a84a0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-percent \
python310-pytest-percent \
python3dist-pytest-percent"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
