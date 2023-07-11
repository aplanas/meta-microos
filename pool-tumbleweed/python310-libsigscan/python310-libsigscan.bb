SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python310-libsigscan-20230109-1.6.aarch64.rpm"
RPM_HASH = "5cf17d9b3658e3127f9276e531a7be72aad55a1b36d00b1758746944f0a7db1a945206c2d232b48f5279a7f1a6124b1b66723e96dfca37957686610a13227c33"

RPROVIDES:${PN} += "python310-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
