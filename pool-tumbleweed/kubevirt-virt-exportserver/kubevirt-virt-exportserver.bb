SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportserver-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "e5471c961ed186f28c69ae0a532d1057f874b9c88810a3a97f176672d6a4e3ef49cb1a8a3be4b876a1ea61f01d907ed82dbbc487a8a977fcab02f43a33d4488f"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
