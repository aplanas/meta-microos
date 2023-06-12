SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-pyuv-1.4.0-5.3.aarch64.rpm"
RPM_HASH = "af297d13ccb31dc458612c4b3279621eab28f8690ab5f2daa7ee8004997687f814d33d7ed323c5e26ce8c6347344e46d859c6ec771d90d78b35bb36e0c46c952"

RPROVIDES:${PN} += "python3-pyuv \
python3.10dist(pyuv) \
python310-pyuv \
python310-pyuv(aarch-64) \
python3dist(pyuv)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libuv.so.1()(64bit) \
python(abi)"

inherit rpm
