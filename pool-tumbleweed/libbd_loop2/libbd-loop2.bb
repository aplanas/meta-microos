SUMMARY = "The loop plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to loop devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_loop2-2.28-1.4.aarch64.rpm"
RPM_HASH = "9891919bb7b8313c969acb20bece48bf13ba32c7117cb733d7b198a292d87491aa37d1bbf4316771cabb12b019404f22c022c8b2ea481168f00690e705c7cc91"

RPROVIDES:${PN} += "libbd_loop.so.2()(64bit) \
libbd_loop2 \
libbd_loop2(aarch-64) \
libblockdev-loop"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbd_utils.so.2()(64bit) \
libbd_utils2 \
libc.so.6(GLIBC_2.27)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm