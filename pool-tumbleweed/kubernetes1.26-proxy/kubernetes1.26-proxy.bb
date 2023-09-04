SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-proxy-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "34b0c87b977761a270036d0075767a03ec88753accb4b7159d895a229752a6fcabda863a85dc5a9e91b6a14baa59003186d5ffcc77b40992a8d21f32006d46d0"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.26-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
