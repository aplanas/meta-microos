SUMMARY = "MANA runtime library"
DESCRIPTION = "This package contains the mana runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libmana1-45.0-1.2.aarch64.rpm"
RPM_HASH = "cebe7ad543bc64e7701c2a0bd4dba050b4d42c87e4c416a6c14f60d3ddc2366534cc75ac661a9fec3cd30541c33cb8bb6ed767d1412a43f36ccb3f063552d2aa"

RPROVIDES:${PN} += "libmana.so.1 \
libmana1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
