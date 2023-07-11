SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-controller-manager-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "59cc0dc75f68393901fbb65b57e7db5ba7d59654a37980e438205c6b1e206df32158b0f54d55d7b005defd53caa5b5bf1d6aba66012577d743ef4dd9fdebdc78"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.27-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
