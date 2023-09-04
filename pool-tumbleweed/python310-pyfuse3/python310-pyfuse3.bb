SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "python310-pyfuse3-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "ae4744bbd14b3f6a21af07be5447d03c1b56d6058a240bb9e2f280d613a8a5923b3b26c7e86b20d0777e06ece4cfb364ff665cfed6a1eb9f7d95bad4ff664770"

RPROVIDES:${PN} += "python3.10dist-pyfuse3 \
python310-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
python-abi \
python310-trio"

inherit rpm
