SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes-apiserver-minus2-1.25.12-34.1.aarch64.rpm"
RPM_HASH = "aa74ce7ae38c8d7875037a9fc8075454f9b7c7fd164bca0607a87d4ab780788dbef0f66bb66ee493b15ff5eb9a78692b516787a8ea9e6ea56674e36d03608a77"

RPROVIDES:${PN} += "kubernetes-apiserver-minus2"

RDEPENDS:${PN} += "kubernetes1.25-apiserver"

inherit rpm
