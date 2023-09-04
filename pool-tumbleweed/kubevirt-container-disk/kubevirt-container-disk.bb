SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-container-disk-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "e6769a3b0baf7e699f51bd7083551bc8bc40e1fbcddfd56c861738143390fb9d59fa9cbc139782521241645f67bf578f3f948d0e3610c0987b03069d70324329"

RPROVIDES:${PN} += "kubevirt-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
