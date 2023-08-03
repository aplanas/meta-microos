SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-proxy-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "a4ef02f5f3406eded41ea9de9974347d980c6b21cfa934518dbde2ea56153b631061e801df10a7475f7ec7274ab7f37ae67a159480e11f316a9395f884159e95"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.24-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
