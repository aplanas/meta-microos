SUMMARY = "Library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
libfmapi is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20230408"

RPM_NAME = "libfmapi1-20230408-1.4.aarch64.rpm"
RPM_HASH = "43397bb23b549cc2b19242d29575c505f0d88a9e3408e856ca595578ffc5b7f5697eab14cf9df217d77db7fc0eb6e7498bc138719d183f29d84aebda0bf2cb35"

RPROVIDES:${PN} += "libfmapi.so.1 \
libfmapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
