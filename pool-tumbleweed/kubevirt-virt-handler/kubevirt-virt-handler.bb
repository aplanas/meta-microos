SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-handler-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "8cdec5197baac65b7292b3145087239922f029255e500ce82e802a6895c3ca5fb1ebacb19dc6f994ff18c66144b909f02bd32822950d92cc961c32573bbaa41a"

RPROVIDES:${PN} += "kubevirt-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
