SUMMARY = "Library to hold functions common to the SCSI utilities"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets. \
 \
This subpackage contains the library of common sg_utils code, such as \
SCSI error processing."
LICENSE = "BSD-3-Clause"

PV = "1.48~20221101+1.142dace"

RPM_NAME = "libsgutils2-1_48-2-1.48~20221101+1.142dace-1.4.aarch64.rpm"
RPM_HASH = "7f84d6f83767c58511d392a8342244452ba8b0730795791c6fa2dc4dd71b2b81579a4192d5d5e9e8cad1a19f6eb5de64d81abf0ad445c0ec88cba7eb86417d79"

RPROVIDES:${PN} += "libsgutils2-1-48-2 \
libsgutils2-1.48.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
