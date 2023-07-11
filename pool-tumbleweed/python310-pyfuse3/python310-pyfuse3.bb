SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.3"

RPM_NAME = "python310-pyfuse3-3.2.3-1.3.aarch64.rpm"
RPM_HASH = "ba5e4b3ae81ee963d596b7630a6ab97c9fa490b5e6d40e3a313aa9d7f956461c432cc5d0b945fd7c7af27cd1157f15b7338a28f2aca45e650dbac638024242c8"

RPROVIDES:${PN} += "python3.10dist-pyfuse3 \
python310-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
python-abi \
python310-trio"

inherit rpm
