SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python311-time-machine-2.9.0-3.2.aarch64.rpm"
RPM_HASH = "eae002717564b77e33a3d75cf0c089e896858af0324682296f7afea9c19d63923f15f0b5ff2f511f1640e930c5ec44c57b5ec1ca7706c4bb4a5699527635cb36"

RPROVIDES:${PN} += "python3-time-machine \
python3.11dist-time-machine \
python311-time-machine \
python3dist-time-machine"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil \
timezone"

inherit rpm
