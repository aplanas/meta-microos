SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-proxy-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "51d138246efe4af2c682d8cb1a4cbe8d0e900597c1c588d51813249ba24f37400e132e803108841437bb46a64d6deaf0da9c42a50e2a36e67704094244ac275b"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.22-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
