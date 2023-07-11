SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "python310-llfuse-1.4.2-1.8.aarch64.rpm"
RPM_HASH = "b286559632fc6aa2bdaf74882bf1e8bebca2d0faecb743cca9a364b519a61739e7b65a2b7ef1d1b8104c0117355bd54d970e2885eae9b7f135d58a40517d1833"

RPROVIDES:${PN} += "python3.10dist-llfuse \
python310-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
