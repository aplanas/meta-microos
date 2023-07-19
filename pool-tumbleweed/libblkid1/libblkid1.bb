SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid1-2.39-3.1.aarch64.rpm"
RPM_HASH = "49fadb854cecb8bba43ca89596e3a70fff6159d3ccfc8b6b6d3a70e19437ba84e3435d1dbb04754452e0fdf2ce1c782dba3a79206b716a9f2cd8759d281de2a0"

RPROVIDES:${PN} += "libblkid.so.1 \
libblkid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
