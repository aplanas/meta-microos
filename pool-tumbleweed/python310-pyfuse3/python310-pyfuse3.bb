SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.3"

RPM_NAME = "python310-pyfuse3-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "f198ac55c53c5b453a7e70cc215708b389306fda56fec7ba3c3f67bbe1ba166fcc8023ddb9844c786ad7240069d4113434d681d875d15f9dc6bb797c95d62b61"

RPROVIDES:${PN} += "python3-pyfuse3 \
python3.10dist(pyfuse3) \
python310-pyfuse3 \
python310-pyfuse3(aarch-64) \
python3dist(pyfuse3)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfuse3.so.3()(64bit) \
libfuse3.so.3(FUSE_3.0)(64bit) \
python(abi) \
python310-trio"

inherit rpm
