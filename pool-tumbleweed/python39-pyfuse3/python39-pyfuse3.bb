SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "python39-pyfuse3-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "0e3ff2f9ecb96b03295ea2d6466bb0164b8dc68d58ed41f18d09572729f4ee1a8194ec0bda686c7511ff8ca9cbdf848992b8f7dd0834f072f1bf06bb17f208ec"

RPROVIDES:${PN} += "python3.9dist-pyfuse3 \
python39-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
python-abi \
python39-trio"

inherit rpm
