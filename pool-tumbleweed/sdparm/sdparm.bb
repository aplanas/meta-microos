SUMMARY = "List or change SCSI disk parameters"
DESCRIPTION = "SCSI disk parameters are held in mode pages. This utility lists or \
changes those parameters. Other SCSI devices (or devices that use the \
SCSI command set) such as CD/DVD and tape drives may also find parts of \
sdparm useful. Requires the linux kernel 2.4 series or later. In the \
2.6 series any device node the understands a SCSI command set may be \
used (e.g. /dev/sda). In the 2.4 series SCSI device node may be used. \
 \
Warning: It is possible (but unlikely) to change SCSI disk settings \
such that the disk stops operating or is slowed down. Use with care."
LICENSE = "BSD-2-Clause & BSD-4-Clause"

PV = "1.12"

RPM_NAME = "sdparm-1.12-2.4.aarch64.rpm"
RPM_HASH = "696fab98dd2520fb8e05c4610f03118ded1753e32cd50aa54126ce3dff1ba78c61f85d8c6ff985a879a1f1bf9d826fd7b421e4df966a730cffc36161da1b94b2"

RPROVIDES:${PN} += "scsi:/sbin/sdparm \
sdparm \
sdparm(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsgutils2-1.48.so.2()(64bit)"

inherit rpm
