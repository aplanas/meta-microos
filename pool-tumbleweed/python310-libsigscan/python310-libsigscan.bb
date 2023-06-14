SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python310-libsigscan-20230109-1.4.aarch64.rpm"
RPM_HASH = "4d0d5b92b0826799cddc6ec54c194b700f6273ae64fa62b685b151a937275482844ddf10822ed150044884c0c5ca17443c82df84172b823383e0e14c9ec2f27d"

RPROVIDES:${PN} += "python3-libsigscan \
python310-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
