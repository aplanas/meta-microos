SUMMARY = "GObject-based Plugin Engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-1_0-0-1.36.0-1.1.aarch64.rpm"
RPM_HASH = "194a93e4122d18c46ef33dd7a428d4e5044fc8285b773d775c7a9cf368b02616a9bf22b0c237c8ec0cc8ae498216865f6f4d19027aad7a01dd9a4fa2ed043085"

RPROVIDES:${PN} += "libpeas \
libpeas-1-0-0 \
libpeas-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
