SUMMARY = "The loop plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to loop devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_loop2-2.28-1.6.aarch64.rpm"
RPM_HASH = "0eeda5841b76f3ef8ce272403d77df44d1b77f9047cdf6ba96b56e889512bf54a740747d9d5b3eb58b8419b9718fb9bbdb6262ac16325ef1f584f60d06778fe4"

RPROVIDES:${PN} += "libbd-loop.so.2 \
libbd-loop2 \
libblockdev-loop"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
