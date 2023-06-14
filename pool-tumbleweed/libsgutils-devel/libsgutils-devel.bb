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

RPM_NAME = "libsgutils-devel-1.48~20221101+1.142dace-1.3.aarch64.rpm"
RPM_HASH = "cb6a75cb8a69c14323b748265325086268fbcbd9a75ddc57d68a938a6f6f2b41ef8c73b83016576f8fb0b5ba1e7f31b51be40e7bf720f3d6529f7544864df1fa"

RPROVIDES:${PN} += "libsgutils-devel \
sg3-utils-devel"

RDEPENDS:${PN} += "libsgutils2-1-48-2"

inherit rpm
