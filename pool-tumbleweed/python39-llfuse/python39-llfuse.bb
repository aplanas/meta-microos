SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "python39-llfuse-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "6ba39d7c1c92fca883f9d8151e3de46bf35c277bd4a789d856c168528bf35404f4e50b9d4744790ead82fe53c278f6d6e64056070928cbc8b4ba9eac1045850d"

RPROVIDES:${PN} += "python3.9dist-llfuse \
python39-llfuse \
python3dist-llfuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
