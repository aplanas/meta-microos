SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "python311-llfuse-1.4.2-1.6.aarch64.rpm"
RPM_HASH = "73c18ba0b9bf9b140135d8c0247088e3c1483d57bb7ab13787d27f4182c38f1585af187b4d7c68c0cef4be20e9fdd9ee3b611224973915a5da03ef3effc0bb84"

RPROVIDES:${PN} += "python3.11dist-llfuse \
python311-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
