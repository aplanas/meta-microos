SUMMARY = "Tools for managing the osinfo database"
DESCRIPTION = "This package provides tools for managing the osinfo database of \
information about operating systems for use with virtualization"
LICENSE = "LGPL-2.1+ & GPL-2.0+"

PV = "1.10.0"

RPM_NAME = "osinfo-db-tools-1.10.0-2.4.aarch64.rpm"
RPM_HASH = "de1f2ce0f7f773847fa40191647d214c70f8b9c98853cb07e09aeabad0260d124742a6d6b438e88cd8bfe452514d52af55b034ecc7cb1e671d2cfed482ab8615"

RPROVIDES:${PN} += "osinfo-db-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2"

inherit rpm
