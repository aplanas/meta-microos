SUMMARY = "GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "libgom-1_0-0-0.4-1.15.aarch64.rpm"
RPM_HASH = "46ef6da3f34c788c737264e9373b590a10c0971d9aed9fd49faa69c08992a575ec6fdfddce9e1183459e0fb2f48cde3d8e14e66ea5948b8fb5a8ef438de88c1d"

RPROVIDES:${PN} += "libgom-1-0-0 \
libgom-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
