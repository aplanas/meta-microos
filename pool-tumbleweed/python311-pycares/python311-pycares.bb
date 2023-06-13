SUMMARY = "Python interface for c-ares"
DESCRIPTION = "pycares is a Python module which provides an interface to \
c-ares. c-ares is a C library that performs DNS requests and name \
resolutions asynchronously"
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python311-pycares-4.3.0-2.1.aarch64.rpm"
RPM_HASH = "202c670e5081415dea68da6b2944c65fed71fbb55554e7d725015febaa113532dec4af6504d6ddac556a53d82c0e21f6c66a3ece9852d4692088bfbd395f312d"

RPROVIDES:${PN} += "python3.11dist(pycares) \
python311-pycares \
python311-pycares(aarch-64) \
python3dist(pycares)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
python(abi) \
python311-cffi"

inherit rpm
