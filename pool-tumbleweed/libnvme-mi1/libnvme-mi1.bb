SUMMARY = "NVMe Managament Interface library for libnvme"
DESCRIPTION = "Provides library functions for managing NVMe devices via the NVMe \
Managament Interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme-mi1-1.4-3.1.aarch64.rpm"
RPM_HASH = "f9123058f2123a782372e6dbefefd61f3ab457ffc26850af58b5376b3af2fa445a65f92a83f7626a858d2fb54e3cd500a5e4b6c9fb324b637ab5380a012b773d"

RPROVIDES:${PN} += "libnvme-mi.so.1 \
libnvme-mi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
