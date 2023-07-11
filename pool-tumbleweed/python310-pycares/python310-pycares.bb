SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python310-pycares-4.3.0-2.3.aarch64.rpm"
RPM_HASH = "426aa5029c7b3abcbb939a8cf7ecffc39104fc99a8b71acb6bd078ab56d0024db92a5524cb7011b1517ebe59a9e6714344c90cb0b0b40b7b9d808ee0c27356f7"

RPROVIDES:${PN} += "python3.10dist-pycares \
python310-pycares \
python3dist-pycares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
