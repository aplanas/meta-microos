SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "python310-llfuse-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "712322a472993e6563fc58361e5900e857f525a233bf42a1b86c91a4f797f16e9819edd0a684a6706331745bed876be12d4af1cb462ff64e54d7d1c490a47991"

RPROVIDES:${PN} += "python3.10dist-llfuse \
python310-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
