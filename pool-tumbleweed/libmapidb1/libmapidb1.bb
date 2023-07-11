SUMMARY = "Library for MAPI data types"
DESCRIPTION = "A library for accessing the Exchange MAPI database format \
 \
libmapidb is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libmapidb1-20210421-2.4.aarch64.rpm"
RPM_HASH = "012d6040a9909e32ca7c5f7a0c2c77c5006cb1bdabaf697e44792245eb6de1247be43c219242f537894d396401c292b3fb99f8f1425c714ca7d8ad6da5aed4e3"

RPROVIDES:${PN} += "libmapidb.so.1 \
libmapidb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1"

inherit rpm
