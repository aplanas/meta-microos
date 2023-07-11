SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-controller-manager-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "d497e968d064f1f6a9283616ee3f49e18c5d9236585066a1b658539f5f718d9373f5474e8439bb76f11f32d9c1e63e268b933eacbd21d704cef6020bf6ef2a6e"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.25-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
