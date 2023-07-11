SUMMARY = "Repair library for the Reiser4 filesystem"
DESCRIPTION = "Reiser4 support library implementing filesystem repair logic."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "librepair-2_0-5-2.0.5-1.8.aarch64.rpm"
RPM_HASH = "37f4b43ca14a686affd2c7e86ecd24424b3fb190fb9d2cfa7f3d7e2ebf18825e23e0b9272167de075746313ab0c86c64992dd8e4f2ab9b6384c88361c9ccf36b"

RPROVIDES:${PN} += "librepair-2-0-5 \
librepair-2.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaal-1.0.so.7 \
libc.so.6 \
libreiser4-2.0.so.5 \
libuuid.so.1"

inherit rpm
