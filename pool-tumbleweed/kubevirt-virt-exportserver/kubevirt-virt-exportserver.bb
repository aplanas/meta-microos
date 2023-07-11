SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-exportserver-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "820baef1f5f6bfa4c51e37c7cfddae415f1631e6bb6310cec78598c80d4927f9089187e8b157c6f730eb0998b8f9f0c262167e5b7009d5bd5c0b4bf3ad85cb73"

RPROVIDES:${PN} += "kubevirt-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
