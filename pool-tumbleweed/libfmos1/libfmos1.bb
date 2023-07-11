SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "libfmos1-20230707-1.1.aarch64.rpm"
RPM_HASH = "42e3b7f61b5c358fcad472c845fa4b9039dbb7e0950b7f49b3d1be1e95e1c9af27c25352788410436acf1d8b79f920806625ad842cc07005621377ef65118432"

RPROVIDES:${PN} += "libfmos.so.1 \
libfmos1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm
