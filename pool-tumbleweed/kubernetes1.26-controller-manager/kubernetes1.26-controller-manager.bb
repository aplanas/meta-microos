SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-controller-manager-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "78f7e42f79c320e8fa5bf2092a7713d4f1fba498c1290b5a69d1b9db9c2a5947e28d23c36ad731f34ed741a95a17d6f3c757a3d62263581bb6fae8b806a0dcd5"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.26-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
