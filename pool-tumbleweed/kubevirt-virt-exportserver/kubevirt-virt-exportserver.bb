SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-exportserver-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "cbc71dfa2292d753284487f0e1e398a241bd78a1e1280e7751cdc7857aab4cc58a48775ea84d8a7a1f3a18cde301db3c435db48d12c1c5ecea696d78e4c3c3ac"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
