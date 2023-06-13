SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.1"

RPM_NAME = "python39-sane-2.9.1-1.11.aarch64.rpm"
RPM_HASH = "4c1061c7b988f112802fc56f0016c8299b451e6d226eef2f5b05cd6d3f42d73e0a30342ac70a64db19122c8e48242516be6e261368e5fbabf2cd310b4c18436d"

RPROVIDES:${PN} += "python3.9dist(python-sane) \
python39-sane \
python39-sane(aarch-64) \
python3dist(python-sane)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsane.so.1()(64bit) \
python(abi)"

inherit rpm
