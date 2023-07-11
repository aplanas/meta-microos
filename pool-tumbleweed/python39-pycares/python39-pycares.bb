SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python39-pycares-4.3.0-2.3.aarch64.rpm"
RPM_HASH = "525a996a62c2c25822a753e1f777254ecc8f8396521e6d7d60da3a498f4facc22509067668ef0453f5c9a46891d263ebfa659be63e27f7e650df49c689c487e5"

RPROVIDES:${PN} += "python3.9dist-pycares \
python39-pycares \
python3dist-pycares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi"

inherit rpm
