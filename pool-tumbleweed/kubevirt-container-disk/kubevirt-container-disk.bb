SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-container-disk-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "f969e2af3588ea67f02cae5acc3d22ac4d90cd6c2fde2b0d85bc9acc091015ca22ef42a5cb25f41da547a78de6c9df12e2a3ed0446406664433db44e51e77150"

RPROVIDES:${PN} += "kubevirt-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
