SUMMARY = "Python module for calling out to Matlab"
DESCRIPTION = "Transplant is a way of calling Matlab from Python. \
 \
Python lists are converted to cell arrays in Matlab, dicts are \
converted to Maps, and numpy ND-Arrays are converted to native \
Matlab matrices. \
 \
All Matlab functions and objects can be accessed from Python."
LICENSE = "BSD-3-Clause"

PV = "0.8.11"

RPM_NAME = "python39-Transplant-0.8.11-3.9.noarch.rpm"
RPM_HASH = "04c9df232e82102ecb7b56b3badbe1571f05f7310d9a375d65aa6778f9f4eb6b63ca466ebc9bfab518ab96ef734810dde80113299987f9e26c49ca2157d5c259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-transplant \
python39-Transplant \
python3dist-transplant"

RDEPENDS:${PN} += "python-abi \
python39-msgpack-python \
python39-numpy \
python39-pyzmq"

inherit rpm
