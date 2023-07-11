SUMMARY = "Library for accessing Windows thumbnail cache databases"
DESCRIPTION = "libwtcdb is a library to access the Windows (Vista/7) Explorer \
thumbnail cache database (WTCDB) format (thumbcache.db). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libwtcdb1-20210417-3.4.aarch64.rpm"
RPM_HASH = "4d93d1af79bd63f45c3567950c851f3bbb3d3165348d9ed5898d63e27f3b758f8ce54f99b4092f3ae4429d28c8e67d6b21309b423cf73b9ee18424f3886dd8e1"

RPROVIDES:${PN} += "libwtcdb.so.1 \
libwtcdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1"

inherit rpm
