SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-controller-manager-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "609bd1fc7192606e3f1022a90e9cc31e7694f22b504a293c6e51b51b9b889d84ec2bac79c02f50cf1ed1be16a83c991264801506f5fcd385e73d8b957b7e4698"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.22-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
