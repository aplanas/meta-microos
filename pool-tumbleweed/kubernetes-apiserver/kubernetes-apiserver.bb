SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-apiserver-1.27.4-34.1.aarch64.rpm"
RPM_HASH = "57ea848abe33f1d02fd5444f8b81f687d111f4982d71658c85ae90f795f80043de1e405cdcc2aabe63a0a1151608c1c2f3ca05c9043c48f3cdc6812d0def44ed"

RPROVIDES:${PN} += "kubernetes-apiserver"

RDEPENDS:${PN} += "kubernetes1.27-apiserver"

inherit rpm
