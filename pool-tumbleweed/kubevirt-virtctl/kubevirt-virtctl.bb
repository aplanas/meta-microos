SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virtctl-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "955752897a8fe7f999847fcdaebdb9dc4e67b1e93db4e2fceae17c66aca34fcb56ceeb2cbb5d0629ed33d813b3a93699e288ad79c79dfdefe5db614ae2957a51"

RPROVIDES:${PN} += "kubevirt-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
