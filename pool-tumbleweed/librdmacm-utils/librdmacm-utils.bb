SUMMARY = "Examples for the librdmacm library"
DESCRIPTION = "Example test programs for the librdmacm library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "librdmacm-utils-45.0-1.1.aarch64.rpm"
RPM_HASH = "db9dda707a115ab64f6f7b7852c495a5b03a36bc4d9be791046e9557bd6031fdb3df49355e972cd66be57e9e7d7be6925630394e60b3ea20b0db7f8598a5278f"

RPROVIDES:${PN} += "librdmacm-tools \
librdmacm-utils \
librdmacm-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibverbs.so.1()(64bit) \
librdmacm.so.1()(64bit)"

inherit rpm
