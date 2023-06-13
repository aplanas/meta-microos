SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-api-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "6f0587e67cd194ae592396ee0feae9479a01f950953e11744490868f9f254f87978aca983f8ab38075c3f77c6a1520cba2952e0f838b0e9c76d1111473a641e0"

RPROVIDES:${PN} += "kubevirt-virt-api \
kubevirt-virt-api(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
