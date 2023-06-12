SUMMARY = "List all SCSI devices in the system"
DESCRIPTION = "The lsscsi command lists information about SCSI devices in Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.32"

RPM_NAME = "lsscsi-0.32-1.3.aarch64.rpm"
RPM_HASH = "27a95e497e4605f4638dccbe99df7019feb68443456fa37d089004f6b25de01d062caaaaaff6ed10d64c46dd499ac5334510ea346184317a8ee327204ffea832"

RPROVIDES:${PN} += "lsscsi \
lsscsi(aarch-64) \
scsi:/usr/bin/lsscsi"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
