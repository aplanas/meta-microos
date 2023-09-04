SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "python311-pyfuse3-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "2d5a0e835b4969e178892abd50e8e9305d965be695bd4f3ce9fbd15d872593c76b6aa7f388417256c81cea067a559b3b2fdc3cf31a723b7d88e848cc19278ea7"

RPROVIDES:${PN} += "python3-pyfuse3 \
python3.11dist-pyfuse3 \
python311-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
python-abi \
python311-trio"

inherit rpm
