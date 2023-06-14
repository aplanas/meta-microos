SUMMARY = "NVMe Managament Interface library for libnvme"
DESCRIPTION = "Provides library functions for managing NVMe devices via the NVMe \
Managament Interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme-mi1-1.4-1.1.aarch64.rpm"
RPM_HASH = "2602a163b25e2d67ccc04746b4d9a1b10a74acbffc27683a206e48d3cd57cf1de0f87c3a4f98c9ebef88718b15abfd03a525077d18798776c57d7476c8b9962c"

RPROVIDES:${PN} += "libnvme-mi.so.1 \
libnvme-mi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
