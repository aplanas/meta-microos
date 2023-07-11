SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-controller-manager-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "86005e5e7a46519ea17e0a1725fde53d3f7cb50994a33ad9c3d53e6231e8d85a64a4daabb9ecce29ac1a1967274c2ccb0f669ad6904f571d7bef03f4ae6bca1a"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.23-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
