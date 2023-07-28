SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportserver-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "31a55b7b270394840ab528ab170bf32fc9b6bac4c2fb9d6a972642c2e5bb796b3280fa636838593b4cbf59b1c38973b6f138a1eee41b5ee5e17e0bdd55461fab"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
