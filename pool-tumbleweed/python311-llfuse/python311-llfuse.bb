SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "python311-llfuse-1.4.2-1.8.aarch64.rpm"
RPM_HASH = "e8b125ce4c89c0fffe8ae07a2c0c1c55dc983f439ef5aa0dc230dc6cf5038789c24ce21cd7808583d2719c2b35885e9eba25376bdcc58aca6703cb9d1c07409a"

RPROVIDES:${PN} += "python3-llfuse \
python3.11dist-llfuse \
python311-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
