SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-handler-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "74a12ebba557733490cfcae45976e7596389f4a4fe94ef902cbc34bc096240240542585595dda08f9ff45a6e949266fc9ea29b4624c2b651a47992d94597fe23"

RPROVIDES:${PN} += "kubevirt-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
