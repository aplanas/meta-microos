SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-proxy-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "f19dd4e22122a20c2cb739046bce82c9603ed9c2a5ae1dba03382889aaaf7f04d76cd3bc5cec52766933069b4ef4d251aff8cac6af56c1ac23cf93a8f9b388b2"

RPROVIDES:${PN} += "kubernetes-proxy-provider \
kubernetes1.23-proxy"

RDEPENDS:${PN} += "conntrack-tools \
ebtables \
ipset \
iptables"

inherit rpm
