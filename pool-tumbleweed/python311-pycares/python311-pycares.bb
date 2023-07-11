SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python311-pycares-4.3.0-2.3.aarch64.rpm"
RPM_HASH = "fdb683681c79cc6dfa1dced86ce532ddd1c4b57f50457b7f18d62daa488c0abcb65624dcb4586da7663a51067c87c0d69fa6ce3d4f8d10cfdc886e4eb60203c4"

RPROVIDES:${PN} += "python3-pycares \
python3.11dist-pycares \
python311-pycares \
python3dist-pycares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi"

inherit rpm
