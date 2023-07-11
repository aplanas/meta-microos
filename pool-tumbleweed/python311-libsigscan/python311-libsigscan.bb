SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python311-libsigscan-20230109-1.6.aarch64.rpm"
RPM_HASH = "72c504e432a3ecdf0af815207f4bc7fd93700044d111ab33fe049a4528dde412342ccec2559e8dd70d0852ec22f977d1287fcf1383ad7117bdd78d5ca0348fd7"

RPROVIDES:${PN} += "python3-libsigscan \
python311-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
