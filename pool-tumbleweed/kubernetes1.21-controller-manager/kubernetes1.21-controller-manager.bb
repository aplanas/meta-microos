SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-controller-manager-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "8c52921c97eb2592f15ffc7076f884b5546477faea124f273a6581e82726c7bf2bc66f45b7b5093b2280f39bcab557480e8e3b953af4cc01002044f41d447fb9"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.21-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
