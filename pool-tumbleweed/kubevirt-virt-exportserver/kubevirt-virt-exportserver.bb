SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportserver-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "84d0b38b5e1d2a5d003beed07b110f6bb0817c434293dfb2faff55ac44c35ff7b0bd7b33140c710eaab7d358eb1ae33eb0e11337e364cdbd29f485dcc1d886e7"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
