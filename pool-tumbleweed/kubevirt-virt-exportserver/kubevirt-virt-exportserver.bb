SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportserver-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "7be75feb2569558b0005e2207b16df3bebde59ca6feb88af36745dc4117e395edd7801da091861d65c21470cdb661111094ae25c94aa485d5cca2f523f77a3dd"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
