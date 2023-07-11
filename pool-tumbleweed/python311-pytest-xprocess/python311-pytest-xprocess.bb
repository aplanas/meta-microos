SUMMARY = "A pytest plugin for managing processes across test runs"
DESCRIPTION = "This will provide a xprocess fixture which can be used to ensure that \
external processes on which your application depends are up and running \
during testing. You can also use it to start and pre-configure \
test-specific databases (i.e. Postgres, Couchdb)."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "python311-pytest-xprocess-0.22.2-1.3.noarch.rpm"
RPM_HASH = "22e55e14acf9fca77fee074772d27062517da450d245ecabd54281d5271daac5efd18f85ca1aa0b3e6bcaf3455ea5d8c365c061b810cb3b0ac7375a529f85cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-xprocess \
python3.11dist-pytest-xprocess \
python311-pytest-xprocess \
python3dist-pytest-xprocess"

RDEPENDS:${PN} += "python-abi \
python311-psutil \
python311-py \
python311-pytest"

inherit rpm
