SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-proxy-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "861dcd03414c291c36a4c758dc8ab1983d874a0804c3d28c139069af10f9babb079bd6a9112bb16054c602f2b86e9b85c90e90c99ebf14beaba7cdf9b6e9212a"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.21-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
