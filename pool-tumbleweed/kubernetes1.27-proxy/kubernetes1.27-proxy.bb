SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-proxy-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "eacbdf8b949a04109f7c96ce28dea0a844aeab7298a8d1a9feaced3090c100365ff45350fc63c7dec4c9ab62ea4e953c3060c664f0faaf4495b92f3247983a6b"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.27-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
