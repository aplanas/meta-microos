SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python311-libsigscan-20230109-2.1.aarch64.rpm"
RPM_HASH = "3126880586fcc0ea7ddd10f038ac873e2030def31edc00dbe139c51487bde1977cdd87470343e3171a9791b02348387733b3e6c938c62b32ae71702e3492e7f3"

RPROVIDES:${PN} += "python3-libsigscan \
python311-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
