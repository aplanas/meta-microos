SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-proxy-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "ddd572a84d7c55311456e5d347781b01008d488facc2cbee5010ea1af0f4355c58ad03d89656be924a4a825cabe38cb28504f77fdc8bb91f3422c5ea0017792e"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.24-proxy \
kubernetes1.24-proxy(aarch-64)"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
