SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "python310-llfuse-1.4.2-1.6.aarch64.rpm"
RPM_HASH = "6c1a215ea2eb509ef77c7491acea89f5ce77a73c1fdfc704cbcd372eef0781a9dfc44772e626690e7bc65f094ce3971d683e69a4ccddb76c27b3e9c398c82379"

RPROVIDES:${PN} += "python3-llfuse \
python3.10dist(llfuse) \
python310-llfuse \
python310-llfuse(aarch-64) \
python3dist(llfuse)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse.so.2()(64bit) \
python(abi)"

inherit rpm
