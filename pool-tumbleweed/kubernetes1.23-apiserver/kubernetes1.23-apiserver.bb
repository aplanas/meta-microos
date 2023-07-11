SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-apiserver-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "1fa8d735e566c0a11e5947b4d04b2a0bc851b2d09f2ee5d415252067a443c5814b14b3bb221c52b96e45706a56e1ef55260e39931ff44a8e6fa1fac47b0ebd19"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.23-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
