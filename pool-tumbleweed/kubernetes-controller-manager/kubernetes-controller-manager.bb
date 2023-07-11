SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes-controller-manager-1.27.3-32.1.aarch64.rpm"
RPM_HASH = "0dcf88bb941d379200a18a8892855ca24d808d7e73ab7ef4db7dd9793170e77c995d820754975c55c5a25e869ac3ac4101b0fbd92d3b1ee5fc66bfba4f3aa8d4"

RPROVIDES:${PN} += "kubernetes-controller-manager"

RDEPENDS:${PN} += "kubernetes1.27-controller-manager"

inherit rpm
