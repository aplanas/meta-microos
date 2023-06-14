SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes-apiserver-1.27.1-30.1.aarch64.rpm"
RPM_HASH = "82b83a32cb826e5e63cba5cb696b5bee994a38b8549880d70825b27b2cc61a6e7d462a5c3863b160944d55bbdbb1a54827225f4351f16d370d354da30e12eae6"

RPROVIDES:${PN} += "kubernetes-apiserver"

RDEPENDS:${PN} += "kubernetes1.27-apiserver"

inherit rpm
