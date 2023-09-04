SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-controller-manager-minus1-1.26.7-34.1.aarch64.rpm"
RPM_HASH = "a1c6060fa68ca63b3af4a66920152de0b011a44bf4e267921fcb3704826094355c0811e6b70fb322cfd6432be558d7169ec62f307018121a38a9342996f73437"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus1"

RDEPENDS:${PN} += "kubernetes1.26-controller-manager"

inherit rpm
