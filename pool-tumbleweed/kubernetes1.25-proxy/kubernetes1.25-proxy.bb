SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-proxy-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "fb7af0e2ea1f754ed8c6602273c3686441b2750d8df83790e669c47122a5bf1f68f6628341d52246ca8bea81d8ae306bf7c9ed96cdded40b7956ed0b8fea9655"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.25-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
