SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "python311-llfuse-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "deeaadfcb5bdfa4b6bc61c77e5c5327bfeafaa5a2eeba2f525b68db60b6332cfc9f8471c7fec400834f1c4ced9a1ffecad96779786300a0a47f2382ede25c1eb"

RPROVIDES:${PN} += "python3-llfuse \
python3.11dist-llfuse \
python311-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
