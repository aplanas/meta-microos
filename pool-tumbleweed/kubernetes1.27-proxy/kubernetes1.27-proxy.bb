SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-proxy-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "47537a963b4f65394b769d188475cee99f081523349cfcec52c53b3e7be9792cddbd1cda451be710cb1e48f5e7b14c08d1cc30f09ac0e7ca7ab68345f7f2ee2e"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.27-proxy \
kubernetes1.27-proxy(aarch-64)"
RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
