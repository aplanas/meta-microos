SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python311-time-machine-2.9.0-2.1.aarch64.rpm"
RPM_HASH = "ce371871ecfcc452bed0c4e23e0235c1c414382eab4393365fe5597f0cd931e133c42881e40c40eb5fc03c0a1f39380cd6557fa43b8bbc9c307762120e713417"

RPROVIDES:${PN} += "python3.11dist(time-machine) \
python311-time-machine \
python311-time-machine(aarch-64) \
python3dist(time-machine)"

RDEPENDS:${PN} += "python(abi) \
python311-python-dateutil \
timezone"

inherit rpm
