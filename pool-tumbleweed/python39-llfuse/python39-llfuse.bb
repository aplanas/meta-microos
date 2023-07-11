SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "python39-llfuse-1.4.2-1.8.aarch64.rpm"
RPM_HASH = "b104c8e79d46a240b110fd23863bb021466296aadde5498fc5b89992a70d965a90403bb92bda81488dcd8a3089bb9bfbf1db2cb5625ef0c1d85bd35ebebf1f72"

RPROVIDES:${PN} += "python3.9dist-llfuse \
python39-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
