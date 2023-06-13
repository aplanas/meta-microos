SUMMARY = "NVMe Managament Interface library for libnvme"
DESCRIPTION = "Provides library functions for managing NVMe devices via the NVMe \
Managament Interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libnvme-mi1-1.4-1.1.aarch64.rpm"
RPM_HASH = "2602a163b25e2d67ccc04746b4d9a1b10a74acbffc27683a206e48d3cd57cf1de0f87c3a4f98c9ebef88718b15abfd03a525077d18798776c57d7476c8b9962c"

RPROVIDES:${PN} += "libnvme-mi.so.1()(64bit) \
libnvme-mi.so.1(LIBNVME_MI_1_1)(64bit) \
libnvme-mi.so.1(LIBNVME_MI_1_2)(64bit) \
libnvme-mi.so.1(LIBNVME_MI_1_3)(64bit) \
libnvme-mi.so.1(LIBNVME_MI_1_4)(64bit) \
libnvme-mi1 \
libnvme-mi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
