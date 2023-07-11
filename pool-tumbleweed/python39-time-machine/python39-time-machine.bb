SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "python39-time-machine-2.9.0-3.2.aarch64.rpm"
RPM_HASH = "b83c1887aea6df2ae1f8d7b07dc3652e5c7642910d9b9769025551e6a9444f6cbc88b77c76a35e243db72e6f68058dde3bcfed2f1dd868e8837e8ae4163095e3"

RPROVIDES:${PN} += "python3.9dist-time-machine \
python39-time-machine \
python3dist-time-machine"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil \
timezone"

inherit rpm
