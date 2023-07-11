SUMMARY = "Client for managing kubevirt"
DESCRIPTION = "The virtctl client is a command-line utility for managing container native virtualization resources"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virtctl-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "d146638814a7361d2c651cb861709280ffbc7aed580b6f00ee445e8f94b8871c5dc5f8e0617c3f3bf35004fd9bf5a5601ebd25f6522e860b6f1c447f8bb6e611"

RPROVIDES:${PN} += "kubevirt-virtctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
