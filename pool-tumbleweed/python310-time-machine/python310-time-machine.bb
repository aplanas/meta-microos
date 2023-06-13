SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python310-time-machine-2.9.0-2.1.aarch64.rpm"
RPM_HASH = "cbb2864532a896bf2e26e5798ae2ccd3ac015f0c323029a07a6f6988040a6c82005e7cdb81f049c13db7fca2af2b0ada01d67b6d2a33ed844ff0bbc862a38374"

RPROVIDES:${PN} += "python3-time-machine \
python3.10dist(time-machine) \
python310-time-machine \
python310-time-machine(aarch-64) \
python3dist(time-machine)"

RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil \
timezone"

inherit rpm
