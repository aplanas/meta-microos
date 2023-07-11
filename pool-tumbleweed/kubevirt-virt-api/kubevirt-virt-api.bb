SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-virt-api-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "ede652377eba8a31697ad718aab59fc662d879faf51e141caa240ac02f4f38a2a0792a3b612693bd0e516e63dc423e82638c0ab465c1852eeaf49a8027a75554"

RPROVIDES:${PN} += "kubevirt-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
