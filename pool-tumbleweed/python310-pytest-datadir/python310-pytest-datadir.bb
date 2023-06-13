SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python310-pytest-datadir-1.4.1-1.1.noarch.rpm"
RPM_HASH = "44add1a071f2dc75fa06f1b81bdbf071dcb0fd1d34fceadcdbc8983370596c6731002144b16df8f36ddfa3a060b790c14aad5317951db3f4a7f340d5c8d02627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-datadir \
python3.10dist(pytest-datadir) \
python310-pytest-datadir \
python3dist(pytest-datadir)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
