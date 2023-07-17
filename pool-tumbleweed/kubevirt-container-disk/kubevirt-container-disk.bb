SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-container-disk-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "f0cf72a63128325ae64e7153ce4c6189031e4f2bc7ae8af77066b2e4bc4f3126e63d5bbc0babaaf703a15abe731bf7ff0158e41ff2b94543965c9c8a140e01c1"

RPROVIDES:${PN} += "kubevirt-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
