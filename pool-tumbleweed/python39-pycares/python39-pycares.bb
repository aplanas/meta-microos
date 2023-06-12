SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python39-pycares-4.3.0-2.1.aarch64.rpm"
RPM_HASH = "ad44b7a0079474120cd7c3205bfb6bbe951be05e9eb349557c330a87af334bda666ae7218d3401e249c813ae5678371bb27ecc9836d867353dd38766c68d0733"

RPROVIDES:${PN} += "python3.9dist(pycares) \
python39-pycares \
python39-pycares(aarch-64) \
python3dist(pycares)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
python(abi) \
python39-cffi"

inherit rpm
