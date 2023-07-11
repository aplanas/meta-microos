SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python39-libsigscan-20230109-1.6.aarch64.rpm"
RPM_HASH = "62e3d95a09750fb245b129b0e5bc5df143b595eda9cf5131eb07717fc789cb1d91a0492a64862c06565b2b7f68234533a2c999a0125f715df7951b5d53ac831d"

RPROVIDES:${PN} += "python39-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
