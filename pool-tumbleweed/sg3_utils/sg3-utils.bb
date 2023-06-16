SUMMARY = "A collection of tools that send SCSI commands to devices"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.48~20221101+1.142dace"

RPM_NAME = "sg3_utils-1.48~20221101+1.142dace-1.3.aarch64.rpm"
RPM_HASH = "bf2eb7dc2408f5acd88cd418a78e26d892b86a4c47676193a7fa7e7ef66cc5400536740d50c65baa61b302a0a566de4645aa1e102571fc93b3e4332efe7616c2"

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
