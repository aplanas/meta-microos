SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.15"

RPM_NAME = "python39-pywayland-0.4.15-1.4.aarch64.rpm"
RPM_HASH = "6a8cc40ac360ecea2dcb3397175a4ae3e28364ee9afebb82d1286735bf45611cd3c51862c029299f5d543f2b96ad1ac4be1c15ad7394032403765ae96623a196"

RPROVIDES:${PN} += "python3.9dist(pywayland) \
python39-pywayland \
python39-pywayland(aarch-64) \
python3dist(pywayland)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
python(abi) \
update-alternatives"

inherit rpm
