SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-proxy-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "a147f2700c4a1120985667db96996231eae3954e45aac3184e64120e0f980b2255fc4f21f08751a67d1e9284922ca4739209c618ab389d642cd953faa7fcf6eb"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.23-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
