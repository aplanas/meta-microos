SUMMARY = "The MD RAID plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to MD RAID."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mdraid2-2.28-1.6.aarch64.rpm"
RPM_HASH = "64db00b4d41475785970cdb4826f58651353eea142b81762b162e5f58b29f8e4addfe74ea174ba7fe1253f03c8937fe2126609501373228dec719d50ccdb5d43"

RPROVIDES:${PN} += "libbd-mdraid.so.2 \
libbd-mdraid2 \
libblockdev-mdraid"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libbytesize.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
mdadm"

inherit rpm
