SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.3"

RPM_NAME = "python39-pyfuse3-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "9bc4bb3b4c232ce1fdec72fa452bbb44c1f39187c85b55cb470c4c52ee3a61bbe3c851db369ee73fa90f66ad171c002097b0d54186be1656db55ea0274451a23"

RPROVIDES:${PN} += "python3.9dist-pyfuse3 \
python39-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
python-abi \
python39-trio"

inherit rpm
