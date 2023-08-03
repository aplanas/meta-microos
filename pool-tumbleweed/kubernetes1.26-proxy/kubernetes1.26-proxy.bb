SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-proxy-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "6901f56cfbf44dc913e5ea89d3b5a0725a1a267e9f32eac533902156800eeb0f598377fd186f3061ff35f94e4e9ce9148c28a19a9690ae59d1805f96b2ee6671"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.26-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
