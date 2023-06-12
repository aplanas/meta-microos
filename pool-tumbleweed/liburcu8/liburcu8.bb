SUMMARY = "Userspace Read-Copy-Update Library"
DESCRIPTION = "liburcu is a LGPLv2.1 userspace RCU (read-copy-update) library. This data \
synchronization library provides read-side access which scales linearly with \
the number of cores. It does so by allowing multiples copies of a given data \
structure to live at the same time, and by monitoring the data structure \
accesses to detect grace periods after which memory reclamation is possible. \
 \
Accesses to detect grace periods after which memory reclamation is possible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT & GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "liburcu8-0.14.0-1.3.aarch64.rpm"
RPM_HASH = "0caef05547d61cf017b85e02a874b7b706252473af16978fa925692e69cf0ae4afc9d72cbcef23ca977185fe6a578fb55a7c9f6b3f6c71cb7ff0f14f986a4bae"

RPROVIDES:${PN} += "liburcu-bp.so.8()(64bit) \
liburcu-cds.so.8()(64bit) \
liburcu-common.so.8()(64bit) \
liburcu-mb.so.8()(64bit) \
liburcu-memb.so.8()(64bit) \
liburcu-qsbr.so.8()(64bit) \
liburcu-signal.so.8()(64bit) \
liburcu.so.8()(64bit) \
liburcu8 \
liburcu8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
