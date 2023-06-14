SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-proxy-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "303426dcc48949d46acbdf026ad9baf0f3ec9e8654d61c1b0a89285c0599da502a50bf4db92cd308b432df7ec7ef2b61a555e79d52bdc9253fdf80af9be131d7"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.20-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
