SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-api-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "cfe3b6d58c94f24829094baaa80340aba3c22462fa11be139106bd6780c975fcd98ee78d82e849094d881067e8e05a2bd6167efd37f51f5a67c400940ed7fac4"

RPROVIDES:${PN} += "kubevirt-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
