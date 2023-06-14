SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-proxy-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "056e47aeb8088ff828fbfd0ec1b8f8b4c52602f8aa9a0185a14540b7c3bb08e0876856ec3674c2a1ed74eb81635766f5cbd8188e7139d732c55c491f3e18da97"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.21-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
