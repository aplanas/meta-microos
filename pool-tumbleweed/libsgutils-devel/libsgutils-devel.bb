SUMMARY = "A collection of tools that send SCSI commands to devices"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsgutils."
LICENSE = "BSD-3-Clause"

PV = "1.48~20221101+1.142dace"

RPM_NAME = "libsgutils-devel-1.48~20221101+1.142dace-1.4.aarch64.rpm"
RPM_HASH = "9cde7f70897f5b3290f19cea42d255acba60b30a3ffe220dc7dd1dfe77ba746c4876ff5b1819c531cef7bd4610b8e55a8c177c9f58b6d3e692359f3387ff2fbc"

RPROVIDES:${PN} += "libsgutils-devel \
sg3-utils-devel"

RDEPENDS:${PN} += "libsgutils2-1-48-2"

inherit rpm
