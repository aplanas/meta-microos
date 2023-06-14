SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-exportserver-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "7768616ed049eff9a537d27de8d8aaaef21d7e0b6dbfb9aa379a81a28387544b99f9a9eeb131d4617df5781423a128e8a6893ed3f828a5eb8c440cc4aa829267"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
