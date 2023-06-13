SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.17.0"

RPM_NAME = "python310-bitstruct-8.17.0-1.1.aarch64.rpm"
RPM_HASH = "3cca049c8bb03c01ab5ef15dc8ad48221e1157da8a07c37a5c91805a0516bc72f2063ffa8d671640dc17e85c6ca16bd42a2a4c92903f3f238fabc5bf38f0b3f8"

RPROVIDES:${PN} += "python3-bitstruct \
python3.10dist(bitstruct) \
python310-bitstruct \
python310-bitstruct(aarch-64) \
python3dist(bitstruct)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
