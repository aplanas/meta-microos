SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-exportserver-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "92162ee72e14caa99bf85d89c304dfbf5dc2d51a1ebb952630e42edd92345d0225c0e10f62fd7c977a7bc9500dc5908d156b17bc82b88de427c062c58a291b8e"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
