SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python39-libsigscan-20230109-2.1.aarch64.rpm"
RPM_HASH = "5bbdee66c57c01805f5b56e48cd7b574974cf7131ce44ca8aba9bb5d97f4860664e0085ca1a4d302bc0a03f204b2414539b083df4125cb0a2e72d200933736c8"

RPROVIDES:${PN} += "python39-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
