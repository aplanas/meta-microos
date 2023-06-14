SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-proxy-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "d4faad206785740882135476917d1193eb7c4e471c9d6f586b1ea15d4db38e53c50d88cc686b5f73de11bc9bb6b5d3fafe641ed48065a6eaa6e85ffea74b1a28"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.26-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
