SUMMARY = "A collection of tools that send SCSI commands to devices"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.48~20221101+1.142dace"

RPM_NAME = "sg3_utils-1.48~20221101+1.142dace-1.4.aarch64.rpm"
RPM_HASH = "cd61c9a12f55a01c525f8a8acc513368cdd7172c03759c7156cddd7f9f5b2d2a4c268cd75d68f0efd1589eb74e741059d34d0f676f567204b25f2bfe8e502442"

RPROVIDES:${PN} += "scsi \
sg-utils \
sg3-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsgutils2-1.48.so.2"

inherit rpm
