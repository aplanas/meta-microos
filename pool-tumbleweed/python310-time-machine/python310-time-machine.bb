SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python310-time-machine-2.9.0-3.2.aarch64.rpm"
RPM_HASH = "31232a7fbd42d0e545e4561672ebfea112079fc614ae8a9fc9d2157820c3761d0b950c348b5be5c275cd3176dfc2d73e3b03bc70e84187823dc0a4745cebf917"

RPROVIDES:${PN} += "python3.10dist-time-machine \
python310-time-machine \
python3dist-time-machine"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
timezone"

inherit rpm
