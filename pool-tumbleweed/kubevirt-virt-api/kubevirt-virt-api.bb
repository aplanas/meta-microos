SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-virt-api-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "09d0fde238e8ac2412e31cac644ab77a2e6fe0ad1f83fd2c19902ef55c261b1ffd20c9cfdf1b1a343c2f08a003aaba3be3216b2e8de8cc6b45d0f9ab043c1b58"

RPROVIDES:${PN} += "kubevirt-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
