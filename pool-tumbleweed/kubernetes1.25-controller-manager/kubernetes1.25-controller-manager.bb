SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-controller-manager-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "7d277d2b4f72db477dd562d585c1578e185ad4c29f23b6e562498c5f38f996ed18d4a91f3c4cdf96fd4a67fcfaf078a0212f83a49d861b38608452d6900594ea"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.25-controller-manager \
kubernetes1.25-controller-manager(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
