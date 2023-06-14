SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-apiserver-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "6f62850eb5a85c56a892e1e27dbbb70374f254195ff68b0ce7906c589532ee6e11317e148e387c563648d21bf22a7cc20560acc7aae97850013684ec9eecf1a8"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.24-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
