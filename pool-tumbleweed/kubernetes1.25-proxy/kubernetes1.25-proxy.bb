SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-proxy-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "f32c397cbbe273d63c9173d5208b66d583c136168852857ee816e41d1eb63224fdde719e4029760904973882254f98e9a0dcbacc0bddcbc6a91412e0eedb59fe"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.25-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
