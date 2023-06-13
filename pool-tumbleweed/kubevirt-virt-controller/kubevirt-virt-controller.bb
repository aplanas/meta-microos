SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-controller-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "ffb1ac7226515bee21d2f1617a3459dff3046ac58dabcff4b3789105034820d5be592cfb76d0141990dd32fc0547763d16176e659d60f1d264141a649c4bdf98"

RPROVIDES:${PN} += "kubevirt-virt-controller \
kubevirt-virt-controller(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
