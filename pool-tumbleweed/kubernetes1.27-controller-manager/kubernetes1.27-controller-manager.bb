SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-controller-manager-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "08d77819ca1b786a2ed7c280b2d7e6ae848217e2ab8a89a8d7953e2dc02f45e7584ba2c16a3b76c6e191dae451d644dbdad0019e45366a6cb56b7451c331058e"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.27-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
