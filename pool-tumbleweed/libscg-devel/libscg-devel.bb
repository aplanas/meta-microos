SUMMARY = "Development files for libscg, a SCSI transport library"
DESCRIPTION = "libscg is a SCSI transport library, providing an abstraction layer \
from operating systems' mechanisms to issue SCSI commands. \
 \
This subpackage contains the header files for developing applications \
that want to make use of libscg."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libscg-devel-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "6def82a5b8045e1bcb3e398fd87a1a8d2d2d1369f69e327209da1b39ba7c12a9a7ff1ae7da715ca3cdc93f454aaa24efe1c723521ec930091a94d99e62b4c447"

RPROVIDES:${PN} += "libscg-devel"

RDEPENDS:${PN} += "librscg1-0 \
libscg1-0 \
libscgcmd1-0 \
libschily-devel"

inherit rpm
