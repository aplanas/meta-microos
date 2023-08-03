SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-controller-manager-1.27.4-33.1.aarch64.rpm"
RPM_HASH = "4e89c94cb915c62bf5b42c1b37f51f97b616ea288c0ba31e72289080190824b4f584aa5479d3b1799ebc1e1d6f880505574a65d96f0cf97c3808c033c83a8664"

RPROVIDES:${PN} += "kubernetes-controller-manager"

RDEPENDS:${PN} += "kubernetes1.27-controller-manager"

inherit rpm
